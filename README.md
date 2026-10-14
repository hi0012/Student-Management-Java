# Student Management System (Java)

A console application for managing student records, built with object-oriented design in Java.

## Features

- Add a student with a name, ID, and GPA
- List all students
- Update a student's GPA by ID
- Handles invalid menu choices and IDs that don't exist

## Design

- A `Student` class keeps its fields private and exposes them through getters and setters
- `StudentManager` keeps the records in memory in an `ArrayList<Student>` and runs the menu loop

## Tech

Java · OOP (classes, encapsulation) · Java Collections · `Scanner` for input

## Run it

```bash
git clone https://github.com/hi0012/Student-Management-Java.git
cd Student-Management-Java
javac StudentManager.java
java StudentManager
```
