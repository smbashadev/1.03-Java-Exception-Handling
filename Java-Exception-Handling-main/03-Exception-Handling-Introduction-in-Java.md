# Exception Handling Introduction in Java

## What is Exception Handling?
- Exception handling is a way to handle runtime errors so that the program does not stop unexpectedly.
- It helps in making the program more reliable and user-friendly.

## Why do we need it?
- To avoid program crash
- To display meaningful messages
- To continue execution after an error

## Basic Idea
- Code that may fail is placed inside try block.
- If failure occurs, the catch block handles it.
- The finally block runs regardless of success or failure.

## Syntax
try {
    // risky code
} catch (ExceptionType e) {
    // handle the error
} finally {
    // cleanup code
}

## Example
public class ExceptionHandlingIntro {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

## Important Points
- A single try block can have multiple catch blocks.
- finally is optional but useful for cleanup.
- catch blocks must be ordered from specific to general.

## Summary
- Exception handling allows a program to respond to errors in a controlled way.
- try, catch, and finally are the main tools used for this.
