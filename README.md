# Student Report Application

## Overview
The Student Report Application is a Java program that allows users to input student details, including student number, full name, course, and marks for two tests. The application calculates the Continuous Assessment (CASS) mark and displays it using dialog boxes.

## Features
- Input student information through dialog boxes.
- Calculate the CASS mark based on the provided test scores.
- Display the results in a user-friendly manner.

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor.

## Setup

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/HChristopherNaoyuki/student-report-system-demo.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd student-report
   ```

3. **Compile the Java Files**:
   ```bash
   javac Solutions/Student.java Solutions/StudentReport.java
   ```

4. **Run the Application**:
   ```bash
   java Solutions.Student
   ```

## Code Explanation

### Classes
- **Student Class**: 
  - Contains the main method to run the application.
  - Prompts the user to enter student details and displays the calculated CASS mark.

- **StudentReport Class**: 
  - Represents a student's report with attributes like student number, full name, course, and marks for two tests.
  - Contains methods to calculate the CASS mark and getter/setter methods for each attribute.

### Key Methods
- `calculateCASSMark()`: Calculates the average of `test1Mark` and `test2Mark` and returns the result.

## Example Usage
1. Upon running the application, users will be prompted to enter:
   - Student Number
   - Full Name
   - Course
   - Test 1 Mark
   - Test 2 Mark
2. After entering the details, a dialog box will display the calculated CASS mark.
