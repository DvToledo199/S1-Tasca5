# Sprint 1 - Task 5

## Level 1 - Exercise 1

---

## Original Statement (Catalan)

Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

---

## Description

This project consists of creating a Java application that lists the contents of a directory received as a command-line parameter. The content must be displayed in alphabetical order.

The program validates the provided path, checks whether it exists and whether it is a directory, and then retrieves and sorts its contents before displaying them.

---

## Project Structure

The project follows a clean separation of responsibilities:

- DirectoryApplication → Contains the main method and handles command-line arguments.
- DirectoryLister → Handles directory validation, retrieval of files, and alphabetical sorting logic.

This structure follows the Single Responsibility Principle (SRP).

---

## Technologies Used

- Java
- Standard Java Library (java.io.File, java.util.Arrays)
- IntelliJ IDEA
- Command-line arguments

---

## Features

- Receives a directory path as a parameter
- Validates that the path exists
- Validates that the path is a directory
- Lists the directory content
- Sorts the content alphabetically
- Applies early return validation (fail fast)

---

## Good Practices Applied

- Clear and descriptive class naming
- Separation of concerns
- Early return validation
- Clean and consistent indentation
- Descriptive variable names in English
- Simple and readable logic (KISS principle)
- Respect for naming conventions (CamelCase for classes, lowerCamelCase for variables and methods)

---

## How to Run

Compile the project and execute it from the command line by providing a directory path as an argument:

java DirectoryApplication /path/to/directory