# finally Block in Java

## 1. Definition

The `finally` block is a block of code that is executed regardless of whether an exception occurs or not.
It is usually used for cleanup activities such as closing files, releasing resources, or closing database connections.

**Why it is used:**

* To ensure important cleanup code runs
* To release memory or resources safely
* To keep the program consistent even after exceptions
* To avoid resource leaks

**How it helps Java:**

* It improves reliability and stability
* It makes resource management safer
* It reduces the chance of leaving files or connections open

## 2. Important Points About finally

* The `finally` block runs after the `try` block, whether the `try` succeeds or fails.
* It also runs after the `catch` block if an exception is handled.
* It is optional, but highly recommended when using resources.
* It executes even if a `return` statement is used inside `try` or `catch`.

## 3. Pseudocode


```

BEGIN
TRY
perform risky task
CATCH (exception)
handle exception
FINALLY
cleanup code
END

```

## 4. Program 1: finally Block with Division by Zero

### Headline:

Using `finally` to Ensure Cleanup Code Runs

### Purpose of the program:

This program demonstrates that the `finally` block always executes even if an exception occurs.

### Why this program is important:

* It shows the exact behavior of `finally`
* It teaches that cleanup code should not be skipped
* It helps beginners understand exception flow clearly

### Program:

> **Error Correction:** The variable initialization lines `int a  10;` and `int b  0;` as well as the calculation line `int result  a / b;` were missing the assignment operator (`=`). This has been corrected below.

```java
public class FinallyExample1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This line always executes.");
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: public class FinallyExample1 {**
* Declares the class name.
* **Line 2: public static void main(String[] args) {**
* Defines the main method.
* **Line 3: try {**
* Starts the try block.
* **Line 4: int a = 10;**
* Declares variable a and assigns it a value of 10.
* **Line 5: int b = 0;**
* Declares variable b and assigns it a value of 0.
* **Line 6: int result = a / b;**
* Tries to divide by zero, which causes an exception.
* **Line 7: System.out.println(result);**
* This line will not run because the exception occurs first.
* **Line 8: } catch (ArithmeticException e) {**
* Catches the division by zero exception.
* **Line 9: System.out.println("Error: Division by zero is not allowed.");**
* Prints a custom error message.
* **Line 10: } finally {**
* Starts the `finally` block.
* **Line 11: System.out.println("This line always executes.");**
* Prints a message that confirms `finally` runs.
* **Line 12: }**
* Ends the `finally` block.
* **Line 13: }**
* Ends main method.
* **Line 14: }**
* Ends class.

### Comments for every line:

```java
public class FinallyExample1 {   // Declares class name
    public static void main(String[] args) {   // Program starts here
        try {   // Starts risky code block
            int a = 10;   // Stores first number
            int b = 0;    // Stores second number
            int result = a / b;   // Division by zero may throw exception
            System.out.println(result);   // Prints result if division succeeds
        } catch (ArithmeticException e) {   // Handles arithmetic error
            System.out.println("Error: Division by zero is not allowed.");   // Shows friendly error message
        } finally {   // Runs no matter what happens
            System.out.println("This line always executes.");   // Cleanup or confirmation message
        }
    }
}

```

### Output:

```
Error: Division by zero is not allowed.
This line always executes.

```

### Summary:

This program proves that the `finally` block runs even after an exception is caught.
It is useful for cleanup actions that must happen every time.

## 5. Program 2: finally Block Without Exception

### Headline:

Checking That `finally` Runs Even When No Error Occurs

### Purpose of the program:

This program shows that `finally` also executes when the try block completes successfully.

### Why this program is important:

* It clarifies that `finally` is not only for errors
* It teaches that cleanup still happens after normal code execution
* It helps understand flow control better

### Program:

> **Error Correction:** The variable initialization lines `int a  10;` and `int b  5;` as well as the calculation line `int result  a / b;` were missing the assignment operator (`=`). This has been corrected below.

```java
public class FinallyExample2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

```

### Line-by-line explanation:

* The try block performs valid division using the assignment operator (`=`).
* The catch block is not executed because there is no exception.
* The `finally` block still prints a message.

### Comments for every line:

```java
public class FinallyExample2 {   // Declares class
    public static void main(String[] args) {   // Program starts here
        try {   // Starts code that may fail
            int a = 10;   // First number
            int b = 5;    // Second number
            int result = a / b;   // Valid division
            System.out.println("Result: " + result);   // Prints result
        } catch (ArithmeticException e) {   // Handles arithmetic issue if any
            System.out.println("Error: Division by zero is not allowed.");   // Not executed in this case
        } finally {   // Runs regardless of success or failure
            System.out.println("Finally block executed.");   // Confirmation message
        }
    }
}

```

### Output:

```
Result: 2
Finally block executed.

```

### Summary:

This example shows that `finally` runs even when the program does not encounter any exception.
It confirms that `finally` is executed after the try block completes successfully.

## 6. Program 3: finally Block with Resource Cleanup (Conceptual)

### Headline:

Using `finally` for Resource Cleanup

### Purpose of the program:

This program demonstrates the typical real-world use of `finally` for closing resources.

### Why this program is important:

* It teaches safe resource management
* It helps prevent memory and file leaks
* It shows a common professional coding practice

### Program:

> **Error Correction:** The variable initialization line `java.io.BufferedReader reader  null;`, instantiation line `reader  new java.io.BufferedReader(...)`, and line reading assignment `String line  reader.readLine();` were missing the assignment operator (`=`). Furthermore, the condition checking expression `if (reader ! null)` was written with an invalid operator syntax and has been corrected to the inequality operator `if (reader != null)`. These errors have been corrected below.

```java
public class FinallyExample3 {
    public static void main(String[] args) {
        java.io.BufferedReader reader = null;

        try {
            reader = new java.io.BufferedReader(new java.io.FileReader("data.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (Exception e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}

```

### Line-by-line explanation:

* `reader` is declared and assigned to `null` before use.
* The file is opened inside the try block using the assignment operator (`=`).
* The first line is read from the file.
* If something goes wrong, the catch block handles it.
* The `finally` block verifies if the object is initialized using `!= null` and tries to close the file whether or not the reading succeeds.

### Comments for every line:

```java
public class FinallyExample3 {   // Declares class
    public static void main(String[] args) {   // Program starts here
        java.io.BufferedReader reader = null;   // Declares reader and sets to null

        try {   // Starts risky file-reading code
            reader = new java.io.BufferedReader(new java.io.FileReader("data.txt"));   // Opens file
            String line = reader.readLine();   // Reads first line
            System.out.println(line);   // Prints the line
        } catch (Exception e) {   // Handles file-related errors
            System.out.println("Error while reading file.");   // Displays error message
        } finally {   // Runs after try/catch to close resources
            try {   // Tries to close file safely
                if (reader != null) {   // Checks if file is open
                    reader.close();   // Closes the file
                }
            } catch (Exception e) {   // Handles closing error
                System.out.println("Error while closing file.");   // Shows close error message
            }
        }
    }
}

```

### Output:

**If the file exists:**

```
First line of file

```

**If the file does not exist:**

```
Error while reading file.

```

### Summary:

This example shows the real-world purpose of `finally`.
It ensures that resources are closed properly, even when exceptions occur.

## 7. Conclusion

The `finally` block is one of the most important parts of Java exception handling.
It guarantees that cleanup code runs, which helps make programs more reliable, professional, and safe.

```

```
