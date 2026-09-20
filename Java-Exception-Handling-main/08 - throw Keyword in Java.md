# throw Keyword in Java

## 1. Definition

The `throw` keyword is used to manually throw an exception in Java.
It is used when a program wants to stop normal execution and signal that something unexpected has happened.

**Why it is used:**

* To create and raise exceptions manually
* To stop execution when a condition is invalid
* To send a custom error message to the caller
* To make the program behave correctly under special conditions

**How it helps Java:**

* It gives developers control over error handling
* It allows custom validation logic
* It improves code clarity and reliability

## 2. Difference Between throw and throws

* `throw` is used to actually throw an exception object.
* `throws` is used in the method signature to declare that a method may throw an exception.
* `throw` is written inside a method body.
* `throws` is written after the method parameters.

**Example:**

```java
throw new ArithmeticException("Cannot divide by zero");

```

## 3. Syntax

```java
throw exceptionObject;

```

**Example:**

```java
throw new IllegalArgumentException("Invalid age");

```

## 4. Program 1: Using throw for Validation

### Headline:

Throwing an Exception Manually

### Purpose of the program:

This program shows how to use the `throw` keyword to stop execution when a condition is not valid.

### Why this program is important:

* It teaches how developers can create their own exception conditions
* It helps understand manual error checking
* It shows how custom validation can be handled clearly

### Program:

> **Error Correction:** The variable initialization line `int age  15;` was missing the assignment operator (`=`). This has been corrected below.

```java
public class ThrowExample1 {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote.");
        }

        System.out.println("You are eligible to vote.");
    }
}

```

### Line-by-line explanation:

* **Line 1: public class ThrowExample1 {**
* Declares the class.
* **Line 2: public static void main(String[] args) {**
* Starts the main method.
* **Line 3: int age = 15;**
* Declares age and initializes it with a value of 15 using the assignment operator (`=`).
* **Line 4:** * Blank line for readability.
* **Line 5: if (age < 18) {**
* Checks whether the age is less than 18.
* **Line 6: throw new ArithmeticException("You are not eligible to vote.");**
* Throws an exception manually because the condition is true.
* **Line 7: }**
* Ends the if block.
* **Line 8:** * Blank line.
* **Line 9: System.out.println("You are eligible to vote.");**
* This line will not execute if the exception is thrown.
* **Line 10: }**
* Ends the main method.
* **Line 11: }**
* Ends the class.

### Comments for every line of code:

```java
public class ThrowExample1 {   // Declares the class
    public static void main(String[] args) {   // Program starts here
        int age = 15;   // Sets age value using assignment operator

        if (age < 18) {   // Checks if age is below 18
            throw new ArithmeticException("You are not eligible to vote.");   // Manually throws exception
        }

        System.out.println("You are eligible to vote.");   // Runs only if no exception is thrown
    }
}

```

### Output:

```
Exception in thread "main" java.lang.ArithmeticException: You are not eligible to vote.

```

### Summary:

This program shows how `throw` is used to manually raise an exception when a condition fails.

## 5. Program 2: Using throw with try-catch

### Headline:

Handling a Manually Thrown Exception

### Purpose of the program:

This program demonstrates how to catch an exception thrown using the `throw` keyword.

### Why this program is important:

* It shows that manual exceptions can also be handled properly
* It teaches the practical use of `throw` with try-catch
* It helps beginners understand complete exception flow

### Program:

> **Error Correction:** The variable initialization line `int number  -5;` was missing the assignment operator (`=`). This has been corrected below.

```java
public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            int number = -5;

            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }

            System.out.println("Valid number: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

```

### Line-by-line explanation:

* The try block contains logic that may throw an exception.
* If the number is negative, the `throw` keyword raises `IllegalArgumentException` after declaring the variable with the assignment operator (`=`).
* The catch block handles the exception and prints the message.

### Comments for every line:

```java
public class ThrowExample2 {   // Declares class
    public static void main(String[] args) {   // Entry point
        try {   // Begins risky code block
            int number = -5;   // Sets negative value using assignment operator

            if (number < 0) {   // Checks if number is negative
                throw new IllegalArgumentException("Number cannot be negative.");   // Throws exception manually
            }

            System.out.println("Valid number: " + number);   // Executes only if number is valid
        } catch (IllegalArgumentException e) {   // Handles the exception
            System.out.println("Error: " + e.getMessage());   // Prints custom message
        }
    }
}

```

### Output:

```
Error: Number cannot be negative.

```

### Summary:

This program shows how `throw` can be used together with try-catch to handle user-defined error situations.

## 6. Important Points About throw

* `throw` is used to manually raise an exception.
* You must create an exception object before using `throw`.
* `throw` is followed by `new ExceptionType(...)`.
* It is usually used inside methods or conditional logic.
* The exception must be handled or declared.

## 7. Conclusion

The `throw` keyword is an important part of Java exception handling.
It allows programmers to create and raise exceptions manually when special conditions occur.
Using `throw` correctly helps make programs more reliable, controlled, and easier to debug.

```

```
