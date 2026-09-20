/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 13-Nested-Try-Catch-Example.java
 * Class Name  : NestedTryDemo
 * Topic       : Nested Try-Catch Block Example
 *
 * Description :
 * This program demonstrates Nested Try-Catch Blocks.
 * A try block can contain another try-catch block to handle
 * exceptions separately.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class NestedTryDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the outer try block.
        try {

            // Displaying the outer try block message.
            System.out.println("Inside Outer Try Block");

            // Beginning of the inner try block.
            try {

                // Displaying the inner try block message.
                System.out.println("Inside Inner Try Block");

                // Declaring two integer variables.
                int firstNumber = 100;
                int secondNumber = 0;

                // Performing division by zero.
                // This statement generates ArithmeticException.
                int result = firstNumber / secondNumber;

                // Displaying the result.
                // This statement will not execute.
                System.out.println("Result = " + result);

            }

            // Catch block for the inner try block.
            catch (ArithmeticException exception) {

                // Displaying the exception message.
                System.out.println("Inner Catch Block Executed");

                // Displaying the exception details.
                System.out.println(exception);

            }

            // Displaying a message after the inner try-catch block.
            System.out.println("Back to Outer Try Block");

        }

        // Catch block for the outer try block.
        catch (Exception exception) {

            // Displaying the exception message.
            System.out.println("Outer Catch Block Executed");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
