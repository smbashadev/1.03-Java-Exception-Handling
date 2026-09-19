/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 11-Try-Catch-Example.java
 * Class Name  : ExceptionHandler
 * Topic       : Try-Catch Block Example
 *
 * Description :
 * This program demonstrates how to handle an exception using
 * the try-catch block. Instead of terminating the program,
 * the exception is caught and an appropriate message is displayed.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ExceptionHandler {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the try block.
        try {

            // Declaring the first integer variable.
            int firstNumber = 20;

            // Declaring the second integer variable.
            int secondNumber = 0;

            // Displaying a message before division.
            System.out.println("Performing Division...");

            // Performing the division operation.
            // This statement generates ArithmeticException.
            int result = firstNumber / secondNumber;

            // Displaying the result.
            // This statement will not execute because an exception occurs.
            System.out.println("Result = " + result);

        }

        // Beginning of the catch block.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception);

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
