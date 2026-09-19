/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 24-Exception-Handling-Best-Practices.java
 * Class Name  : BestPracticeDemo
 * Topic       : Exception Handling Best Practices
 *
 * Description :
 * This program demonstrates some basic exception handling
 * best practices in Java.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class BestPracticeDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the first number.
        int firstNumber = 20;

        // Declaring the second number.
        int secondNumber = 0;

        // Beginning of the try block.
        try {

            // Checking whether the second number is zero.
            if (secondNumber == 0) {

                // Throwing an exception with a meaningful message.
                throw new ArithmeticException("Division by zero is not allowed.");

            }

            // Performing the division.
            int result = firstNumber / secondNumber;

            // Displaying the result.
            System.out.println("Result : " + result);

        }

        // Catch block to handle ArithmeticException.
        catch (ArithmeticException exception) {

            // Displaying a user-friendly error message.
            System.out.println("Error : " + exception.getMessage());

        }

        // Finally block.
        finally {

            // Displaying the finally block message.
            System.out.println("Program Resources Released.");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
