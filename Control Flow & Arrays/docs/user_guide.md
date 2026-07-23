# User Guide

## Introduction

The Grade Management System is a Java console application that helps users manage student academic records.

The application allows users to:

- Add students
- Store subject marks
- View student records
- Calculate averages
- Assign grades
- Search students
- Find the top performer
- Generate performance reports

---

## Getting Started

Compile the Java files.

```bash
javac *.java
```

Run the application.

```bash
java GradeManagementSystem
```

---

## Main Menu

```
===== GRADE MANAGEMENT SYSTEM =====

1. Add Student
2. View Students
3. Calculate Average and Grade
4. Search Student
5. Find Top Performer
6. Generate Performance Report
7. Exit
```

---

## Features

### 1. Add Student

- Enter student name.
- Enter marks for:
  - Math
  - Science
  - English
  - History
  - Computer

Marks must be between **0 and 100**.

---

### 2. View Students

Displays all students in a tabular format.

Example:

```
Name          Math  Science English History Computer
Pratyush      90    95      80      85      100
Prem          70    80      65      90      75
```

---

### 3. Calculate Average and Grade

Displays:

- Student Name
- Average Marks
- Grade

---

### 4. Search Student

Search by student name.

Displays:

- Student Name
- Marks
- Average
- Highest Mark
- Lowest Mark
- Grade

---

### 5. Find Top Performer

Displays:

- Student Name
- Average
- Grade

---

### 6. Generate Performance Report

Displays:

- Total Students
- Subject-wise Average
- Top Performer
- Grade Distribution

---

## Grade Criteria

| Average  | Grade |
| -------- | ----- |
| 90–100   | A+    |
| 80–89    | A     |
| 70–79    | B     |
| 60–69    | C     |
| 50–59    | D     |
| Below 50 | F     |

---

## Input Validation

The system validates:

- Menu choices
- Student marks (0–100)
- Numeric input

Invalid inputs prompt the user to enter the data again.

---

## Technologies Used

- Java
- Arrays
- Classes & Objects
- Methods
- Exception Handling
- Scanner Class
- Object-Oriented Programming (OOP)

---

## Project Author

**Pratyush Gupta**
