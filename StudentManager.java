import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update GPA");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateGpa(); break;
                case 4: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        students.add(new Student(name, id, gpa));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void updateGpa() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new GPA: ");
                double newGpa = scanner.nextDouble();
                s.setGpa(newGpa);
                System.out.println("GPA updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
