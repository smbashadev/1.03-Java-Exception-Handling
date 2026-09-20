# Default Exception Handler in Java

## What is the Default Exception Handler?
- Java has a built-in mechanism that handles uncaught exceptions.
- If an exception is not caught by any catch block, Java's default exception handler takes over.

## What does it do?
- It prints the exception name.
- It shows the message associated with the exception.
- It displays the stack trace, which tells where the exception happened.
- It terminates the program.

## Example
public class DefaultExceptionHandlerExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;   // this will cause ArithmeticException
        System.out.println(result);
    }
}

## Output (conceptually)
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at DefaultExceptionHandlerExample.main(DefaultExceptionHandlerExample.java:6)

## Important Point
- The default exception handler is not a replacement for proper exception handling.
- We should use try-catch to handle exceptions gracefully.

## Summary
- If an exception is not handled, Java prints the error details and stops the program.
- The default exception handler is useful for debugging but not for user-friendly error management.
