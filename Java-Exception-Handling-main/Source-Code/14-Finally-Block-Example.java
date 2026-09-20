/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 14-Finally-Block-Example.java
 * Class Name  : FinallyDemo
 * Topic       : Finally Block Example
 *
 * Description :
 * This program demonstrates the use of the finally block.
 * The finally block always executes whether an exception
 * occurs or not.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class FinallyDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the try block.
        try {

            // Displaying a message.
            System.out.println("Inside Try Block");

            // Declaring the first integer variable.
            int firstNumber = 100;

            // Declaring the second integer variable.
            int secondNumber = 0;

            // Performing division by zero.
            // This statement generates ArithmeticException.
            int result = firstNumber / secondNumber;

            // Displaying the result.
            // This statement will not execute.
            System.out.println("Result = " + result);

        }

        // Catch block to handle ArithmeticException.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception);

        }

        // Finally block.
        finally {

            // Displaying a message from the finally block.
            System.out.println("Finally Block Executed");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
