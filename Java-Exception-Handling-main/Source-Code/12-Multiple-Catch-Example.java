/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 12-Multiple-Catch-Example.java
 * Class Name  : MultipleCatchDemo
 * Topic       : Multiple Catch Block Example
 *
 * Description :
 * This program demonstrates the use of multiple catch blocks.
 * Depending on the type of exception generated, the corresponding
 * catch block will be executed.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class MultipleCatchDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the try block.
        try {

            // Declaring an integer array.
            int[] numbers = {10, 20, 30};

            // Displaying a message.
            System.out.println("Accessing Array Element...");

            // Accessing an invalid array index.
            // This statement generates ArrayIndexOutOfBoundsException.
            System.out.println(numbers[5]);

            // Declaring two integer variables.
            int firstNumber = 10;
            int secondNumber = 0;

            // Performing division.
            // This statement will not execute because an exception
            // has already occurred above.
            int result = firstNumber / secondNumber;

            // Displaying the result.
            System.out.println(result);

        }

        // Catch block for ArithmeticException.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("ArithmeticException Caught");

        }

        // Catch block for ArrayIndexOutOfBoundsException.
        catch (ArrayIndexOutOfBoundsException exception) {

            // Displaying the exception message.
            System.out.println("ArrayIndexOutOfBoundsException Caught");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
