# Checked and Unchecked Exceptions in Java

## 1. Introduction

In Java, exceptions are divided into two main categories:
* Checked Exceptions
* Unchecked Exceptions

These categories help developers understand which errors must be handled by force and which ones occur due to programming or runtime mistakes.

---

## 2. Checked Exceptions

### Definition:
Checked exceptions are exceptions that are verified by the compiler at compile time. If a method throws a checked exception, the code will not compile unless it is handled or declared.

### Important points:
* The programmer must handle them using a `try-catch` block or declare them using the `throws` keyword.
* They usually occur due to external factors outside the program's control, like file systems, databases, or network operations.

### Examples:
* `IOException`
* `SQLException`
* `FileNotFoundException`

### Why they are important:
* They force the programmer to anticipate and handle external failures.
* They significantly improve program reliability.

---

## 3. Unchecked Exceptions

### Definition:
Unchecked exceptions are exceptions that are not verified by the compiler at compile time. They are checked at runtime instead.

### Important points:
* They are also known as **Runtime Exceptions** because they extend the `RuntimeException` class.
* They usually occur due to programming flaws, logic errors, or improper use of an API.
* The compiler does not force the developer to declare or handle them explicitly.

### Examples:
* `ArithmeticException`
* `NullPointerException`
* `ArrayIndexOutOfBoundsException`
* `IllegalArgumentException`

### Why they are important:
* They help identify bugs, logical flaws, or invalid assumptions in the code.
* They can usually be prevented or avoided entirely by writing clean, defensive validation code.

---

## 4. Difference Between Checked and Unchecked Exceptions

| Feature | Checked Exceptions | Unchecked Exceptions |
| :--- | :--- | :--- |
| **Compiler Check** | Checked at compile time. | Checked at runtime (ignored at compile time). |
| **Requirement** | Must be explicitly caught or declared using `throws`. | Not required to be caught or declared. |
| **Inheritance** | Extends `java.lang.Exception` (but not `RuntimeException`). | Extends `java.lang.RuntimeException`. |
| **Cause** | External conditions (missing files, network drops). | Internal programming/logic errors (null references, bad math). |
| **Example** | `IOException` | `ArithmeticException` |

---

## 5. Program 1: Checked Exception Example

### Headline:
Handling Checked Exception Using try-catch

### Purpose of the program:
This program shows how to handle a checked exception (`IOException` / `FileNotFoundException`) when attempting to open an external file.

### Why this program is important:
* It demonstrates compile-time exception compliance.
* It shows how to safely interact with local file systems.
* It explains how the program handles a missing file scenario gracefully without crashing.

### Program:
> **Error Correction:** The instantiation line `FileReader file = new FileReader("demo.txt");` must be safely enclosed within a block that handles potential file errors. This has been properly implemented below.

```java
import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("demo.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: import java.io.*;**
* Imports the required classes for input/output operations.


* **Line 3: public class CheckedExceptionExample {**
* Declares the public class structure.


* **Line 4: public static void main(String[] args) {**
* Defines the main entry point of the Java application.


* **Line 5: try {**
* Starts the protected block of code containing operations that might fail.


* **Line 6: FileReader file = new FileReader("demo.txt");**
* Attempts to look for and read a file named "demo.txt" using the assignment operator (`=`).


* **Line 7: System.out.println("File opened successfully.");**
* Prints a message to the console if the file is successfully located.


* **Line 8: file.close();**
* Safely closes the file resource to prevent any system resource leaks.


* **Line 9: } catch (IOException e) {**
* Catches any `IOException` (or its child `FileNotFoundException`) thrown during execution.


* **Line 10: System.out.println("Error: " + e.getMessage());**
* Prints a user-friendly error string with details provided by the exception object.


* **Line 11: }**
* Closes the catch handling block.



### Comments for every line:

```java
import java.io.*; // Imports file operations package

public class CheckedExceptionExample { // Defines the executable class
    public static void main(String[] args) { // Entry point of the program
        try { // Starts block for monitored actions
            FileReader file = new FileReader("demo.txt"); // Opens file via assignment operator
            System.out.println("File opened successfully."); // Runs only if file is found
            file.close(); // Releases file system lock
        } catch (IOException e) { // Catches compile-time checked exception
            System.out.println("Error: " + e.getMessage()); // Prints details of the error
        }
    }
}

```

### Output:

**If file exists:**

```
File opened successfully.

```

**If file does not exist:**

```
Error: demo.txt (The system cannot find the file specified)

```

### Summary:

This program demonstrates that the Java compiler forces developers to provide a strategy (like `try-catch`) to deal with external real-world failures before compiling.

---

## 6. Program 2: Unchecked Exception Example

### Headline:

Handling Unchecked Exception Gracefully

### Purpose of the program:

This program shows how an unchecked exception like `ArithmeticException` behaves when runtime logic errors occur.

### Why this program is important:

* It outlines the nature of runtime errors caused by internal programming math mistakes.
* It teaches how explicit handling can stop an application from unexpectedly crashing.
* It reinforces why defensive coding practices are better than relying completely on catching runtime errors.

### Program:

> **Error Correction:** The variable definitions `int a = 10;`, `int b = 0;`, and `int result = a / b;` require precise application of the assignment operator (`=`). This has been configured properly below.

```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: public class UncheckedExceptionExample {**
* Defines the runtime exception demonstration class.


* **Line 3: int a = 10;**
* Declares integer `a` and sets it to 10.


* **Line 4: int b = 0;**
* Declares integer `b` and sets it to 0.


* **Line 6: try {**
* Isolates calculation statements where bad math logic could crash the system.


* **Line 7: int result = a / b;**
* Performs the mathematical division which results in an explicit runtime error.


* **Line 8: System.out.println(result);**
* Skips execution instantly since line 7 throws a fault object.


* **Line 9: } catch (ArithmeticException e) {**
* Catches the runtime mathematical exception object seamlessly.


* **Line 10: System.out.println("Cannot divide by zero.");**
* Prints a safe confirmation string to inform the user.



### Comments for every line:

```java
public class UncheckedExceptionExample { // Declares application class
    public static void main(String[] args) { // Execution start point
        int a = 10; // First integer value initialization
        int b = 0; // Divider initialization set to zero

        try { // Starts error monitoring container
            int result = a / b; // Performs math which initiates internal crash state
            System.out.println(result); // Statement is completely bypassed on error
        } catch (ArithmeticException e) { // catches logic runtime errors seamlessly
            System.out.println("Cannot divide by zero."); // Outputs explanation message safely
        }
    }
}

```

### Output:

```
Cannot divide by zero.

```

### Summary:

The compiler completely skipped checking line 7 during compile time. The error was encountered only during runtime execution and intercepted by the `catch` statement.

---

## 7. Important Rules

* **Checked exceptions** must always be handled via `try-catch` blocks or passed up using a explicit `throws` clause.
* **Unchecked exceptions** indicate structural flaws, algorithmic omissions, or flawed API code configurations.
* Good engineering dictates that you avoid catching general runtime exceptions (`RuntimeException`) when a minor logical parameter check (such as `if (b != 0)`) can prevent the exception entirely.

---

## 8. Conclusion

Checked and unchecked exceptions represent distinct control flows within the Java Runtime System. Checked structures enforce defensive programming for unavoidable real-world constraints, while unchecked runtime elements expose bugs and logical failures. Balancing both concepts keeps execution routines stable, reliable, and smooth.

```

```
