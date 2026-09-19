/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 25-Comprehensive-Exception-Demo.java
 * Class Name  : ExceptionRevision
 * Topic       : Comprehensive Exception Handling Demo
 *
 * Description :
 * This program demonstrates the major exception handling concepts
 * learned in this repository.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring a custom exception class.
class InvalidNumberException extends Exception {

    // Constructor for the custom exception.
    public InvalidNumberException(String message) {

        // Passing the message to the parent class.
        super(message);

    }

}

// Declaring the main class.
public class ExceptionRevision {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the try block.
        try {

            // Calling the calculate() method.
            calculate();

        }

        // Catch block for ArithmeticException.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("Arithmetic Exception : " + exception.getMessage());

        }

        // Catch block for InvalidNumberException.
        catch (InvalidNumberException exception) {

            // Displaying the exception message.
            System.out.println("Custom Exception : " + exception.getMessage());

        }

        // Catch block for any other exception.
        catch (Exception exception) {

            // Displaying the exception message.
            System.out.println("General Exception : " + exception.getMessage());

        }

        // Finally block.
        finally {

            // Displaying the finally block message.
            System.out.println("Finally Block Executed");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

    // Declaring a method with throws keyword.
    public static void calculate() throws InvalidNumberException {

        // Declaring the first number.
        int firstNumber = 100;

        // Declaring the second number.
        int secondNumber = 0;

        // Checking whether the second number is zero.
        if (secondNumber == 0) {

            // Throwing a custom exception.
            throw new InvalidNumberException("Second number should not be zero.");

        }

        // Performing division.
        int result = firstNumber / secondNumber;

        // Displaying the result.
        System.out.println("Result : " + result);

    }

}
