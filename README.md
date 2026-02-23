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

---

## Level 1 - Exercise 3

---

## Original Statement (Catalan)

Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

---

## Description

This exercise modifies the previous implementation by changing the output destination.

Instead of printing the directory tree structure to the console, the program now stores the result in a TXT file.

The directory structure is first built using a StringBuilder, keeping the traversal logic separated from the output mechanism. Once the full directory tree is generated as a String, it is written to a text file located in the `target` directory.

This design improves separation of responsibilities and prepares the project for future extensions.

---

## Project Structure

- DirectoryApplication → Handles command-line arguments and manages file writing.
- DirectoryLister → Builds and returns the directory tree structure as a String.

The solution maintains the Single Responsibility Principle (SRP):

- DirectoryLister → Responsible only for generating the directory tree.
- DirectoryApplication → Responsible for deciding how to use or store the generated result.

---

## Technologies Used

- Java
- java.io.File
- java.io.FileWriter
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
- Directory tree generation using StringBuilder
- Output saved into `target/output.txt`
- Proper exception handling using try-catch
- Executable from the command line using Maven

---

## How to Compile

From the project root (where `pom.xml` is located):

mvn clean compile

---

## How to Run

From the project root:

mvn exec:java -Dexec.mainClass="level1.ejercicio3.DirectoryApplication" -Dexec.args="directoryPath"

Example:

mvn exec:java -Dexec.mainClass="level1.ejercicio3.DirectoryApplication" -Dexec.args="."

After execution, the generated file can be found at:

target/output.txt

---

## Level 1 - Exercise 4

---

## Original Statement (Catalan)

Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

---

## Description

This exercise extends the previous implementation by adding the ability to read any TXT file and display its content in the console.

The application now behaves depending on the type of path received as a command-line argument:

- If the path corresponds to a directory, the program generates the directory tree and stores it in `target/output.txt` (Exercise 3 functionality).
- If the path corresponds to a TXT file, the program reads its content and prints it to the console.

A new class, `TextFileReader`, has been introduced to handle file reading operations while maintaining separation of responsibilities.

---

## Project Structure

- DirectoryApplication → Entry point of the program. Decides whether to list a directory or read a file.
- DirectoryLister → Generates the directory tree as a String.
- TextFileReader → Reads a TXT file and returns its content as a String.

The solution maintains the Single Responsibility Principle (SRP):

- DirectoryLister → Responsible only for generating directory structure.
- TextFileReader → Responsible only for reading text files.
- DirectoryApplication → Responsible for controlling program flow.

---

## Technologies Used

- Java
- java.io.File
- java.io.FileWriter
- java.io.FileReader
- java.io.BufferedReader
- java.util.Arrays
- java.util.Date
- Maven
- Command-line execution

---

## Features

- Detects whether the provided path is a directory or a file
- Generates and saves directory tree to `target/output.txt`
- Reads any TXT file and prints its content
- Recursive directory traversal
- Alphabetical sorting at each level
- Proper resource management (closing streams)
- Exception handling using try-catch
- Executable from the command line using Maven

---

## How to Compile

From the project root (where `pom.xml` is located):

mvn clean compile

---

## How to Run

### 1. Generate directory tree and save it to a file

mvn exec:java -Dexec.mainClass="level1.ejercicio4.DirectoryApplication" -Dexec.args="directoryPath"

Example:

mvn exec:java -Dexec.mainClass="level1.ejercicio4.DirectoryApplication" -Dexec.args="."

This will generate:

target/output.txt

---

### 2. Read a TXT file and print its content

mvn exec:java -Dexec.mainClass="level1.ejercicio4.DirectoryApplication" -Dexec.args="path/to/file.txt"

Example:

mvn exec:java -Dexec.mainClass="level1.ejercicio4.DirectoryApplication" -Dexec.args="target/output.txt"