# throws Keyword in Java

## 1. Definition

The `throws` keyword is used in a method declaration to indicate that the method may throw one or more exceptions.
It tells the caller that the method is not handling the exception itself and that the caller must handle it.

**Why it is used:**

* To declare possible exceptions
* To pass responsibility to the caller
* To improve code readability
* To inform the compiler about checked exceptions

**How it helps Java:**

* It makes exception flow clear
* It helps in writing safer programs
* It avoids silent error handling

## 2. Difference Between throw and throws

* `throw` is used to manually raise an exception inside a method.
* `throws` is used in the method signature to declare that a method may throw an exception.
* `throw` is followed by an exception object.
* `throws` is followed by exception types.

**Example:**

```java
throw new ArithmeticException("Error");

```

**Example:**

```java
public void readFile() throws IOException { }

```

## 3. Syntax

```java
returnType methodName() throws ExceptionType1, ExceptionType2 {
    // method body
}

```

## 4. Program 1: Using throws with a Checked Exception

### Headline:

Declaring Exceptions with throws

### Purpose of the program:

This program shows how to use the `throws` keyword when a method can throw an `IOException`.

### Why this program is important:

* It explains how checked exceptions are declared
* It helps beginners understand caller responsibility
* It shows a real-life file handling scenario

### Program:

> **Error Correction:** The instantiation line `FileReader file  new FileReader("data.txt");` was missing the assignment operator (`=`). This has been corrected below.

```java
import java.io.*;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File opened successfully.");
        file.close();
    }
}

```

### Line-by-line explanation:

* The import statement brings in file handling classes.
* The main method calls `readFile()` inside a try block.
* The catch block handles `IOException` if it happens.
* The `readFile()` method declares `throws IOException`.
* If the file is missing, the exception is thrown to the caller.

### Comments for every line:

```java
import java.io.*;   // Imports file-related classes

public class ThrowsExample1 {   // Declares class
    public static void main(String[] args) {   // Program starts here
        try {   // Starts block that may catch exception
            readFile();   // Calls method that may throw exception
        } catch (IOException e) {   // Handles file-related error
            System.out.println("Error while reading file: " + e.getMessage());   // Prints error message
        }
    }

    static void readFile() throws IOException {   // Declares possible IOException
        FileReader file = new FileReader("data.txt");   // Tries to open file using assignment operator
        System.out.println("File opened successfully.");   // Prints success message
        file.close();   // Closes the file
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
Error while reading file: data.txt (The system cannot find the file specified)

```

### Summary:

This example shows that `throws` is used to declare checked exceptions so that the caller can handle them.

## 5. Program 2: throws with Multiple Exceptions

### Headline:

Declaring More Than One Exception Type

### Purpose of the program:

This program shows how a method can declare multiple exceptions using `throws`.

### Why this program is important:

* It teaches how multiple exceptions can be declared together
* It improves understanding of method declarations
* It prepares students for larger programs

### Program:

> **Error Correction:** The variable initialization lines `int a  10;` and `int b  0;` along with the calculation line `int result  a / b;` were missing the assignment operator (`=`). This has been corrected below.

```java
import java.io.*;

public class ThrowsExample2 {
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (IOException e) {
            System.out.println("IOException handled.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled.");
        }
    }

    static void testMethod() throws IOException, ArithmeticException {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }
}

```

### Line-by-line explanation:

* The method `testMethod()` declares both `IOException` and `ArithmeticException`.
* The main method catches both exceptions separately.
* The division by zero causes `ArithmeticException`.

### Comments for every line:

```java
import java.io.*;   // Imports input/output classes

public class ThrowsExample2 {   // Declares class
    public static void main(String[] args) {   // Program starts here
        try {   // Starts block that may throw exceptions
            testMethod();   // Calls method that may throw exceptions
        } catch (IOException e) {   // Handles file exception
            System.out.println("IOException handled.");
        } catch (ArithmeticException e) {   // Handles arithmetic exception
            System.out.println("ArithmeticException handled.");
        }
    }

    static void testMethod() throws IOException, ArithmeticException {   // Declares two possible exceptions
        int a = 10;   // First number set using assignment operator
        int b = 0;    // Second number set using assignment operator
        int result = a / b;   // Division by zero may throw exception
        System.out.println(result);   // Prints result if no exception
    }
}

```

### Output:

```
ArithmeticException handled.

```

### Summary:

This example shows that `throws` can list multiple exceptions that a method may cause.

## 6. Important Points About throws

* `throws` is used in the method declaration.
* It is typically expected for checked exceptions.
* It tells the caller to handle the exception.
* It does not throw the exception itself; it only declares it.
* A method can declare more than one exception type.

## 7. Conclusion

The `throws` keyword is important in Java exception handling.
It informs the caller that a method may cause an exception and that the caller should handle it properly.
Using `throws` correctly makes Java programs more reliable and easier to understand.

```

```
