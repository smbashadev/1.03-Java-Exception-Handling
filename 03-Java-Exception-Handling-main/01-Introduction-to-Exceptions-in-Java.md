# Introduction to Exceptions in Java

## What is an Exception?
- An exception is an event that disrupts the normal flow of a program.
- It occurs at runtime when something unexpected happens, such as invalid input, division by zero, or trying to access a file that does not exist.

## Why Exceptions are Important
- They help us handle errors gracefully instead of crashing the program.
- They make code easier to understand and debug.
- They allow the programmer to separate normal logic from error-handling logic.

## Types of Exceptions in Java
### 1. Checked Exceptions
- These are checked at compile time.
- Example: IOException, SQLException
### 2. Unchecked Exceptions
- These occur at runtime.
- Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
### 3. Errors
- Serious problems that are usually not handled by the program.
- Example: OutOfMemoryError, StackOverflowError

## Basic Syntax
try {
    // code that may cause an exception
} catch (ExceptionType e) {
    // handle the exception
} finally {
    // code that always executes
}

## Example
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This block always runs");
        }
    }
}

## Important Keywords
- try: contains code that may throw an exception
- catch: handles the exception
- finally: executes regardless of whether an exception occurs
- throw: manually throws an exception
- throws: declares that a method may throw an exception

## Summary
- Exceptions are used to handle runtime problems.
- Java provides try, catch, finally, throw, and throws keywords.
- Proper exception handling improves program reliability and user experience.
