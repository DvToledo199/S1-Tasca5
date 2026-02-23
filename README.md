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

---

## Level 1 - Exercise 2

---

## Original Statement (Catalan)

Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

---

## Description

This exercise extends the previous one by adding recursive functionality to list the entire directory tree.

The program now traverses all subdirectories recursively and prints the full directory structure in alphabetical order at each level. For each element, it displays:

- Whether it is a directory (D) or a file (F)
- The name of the element
- Its last modification date

---

## Project Structure

- DirectoryApplication → Entry point of the program. Handles command-line arguments.
- DirectoryLister → Contains the recursive logic to explore the directory tree.

The solution follows the Single Responsibility Principle (SRP), keeping the application logic separated from the directory exploration logic.

---

## Technologies Used

- Java
- java.io.File
- java.util.Arrays
- java.util.Date
- Maven
- Command-line execution

---

## Features

- Recursive directory traversal
- Alphabetical sorting at each level
- Directory and file type identification (D / F)
- Last modification date display
- Proper validation of input path
- Executable from the command line using Maven

---

## How to Compile

From the project root (where pom.xml is located):

mvn clean compile

---

## How to Run

From the project root:

mvn exec:java -Dexec.mainClass="level1.ejercicio2.DirectoryApplication" -Dexec.args="directoryPath"

Example:

mvn exec:java -Dexec.mainClass="level1.ejercicio2.DirectoryApplication" -Dexec.args="."