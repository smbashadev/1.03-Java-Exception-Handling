/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 20-Voting-Application.java
 * Class Name  : VotingSystem
 * Topic       : Voting Application Using Custom Exception
 *
 * Description :
 * This program demonstrates how to use a custom exception in a
 * real-world voting eligibility application.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring a custom exception class.
class InvalidAgeException extends Exception {

    // Creating a constructor for the custom exception.
    public InvalidAgeException(String message) {

        // Passing the message to the parent Exception class.
        super(message);

    }

}

// Declaring the main class.
public class VotingSystem {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the age variable.
        int age = 16;

        // Displaying the entered age.
        System.out.println("Entered Age : " + age);

        // Beginning of the try block.
        try {

            // Checking whether the age is less than 18.
            if (age < 18) {

                // Throwing the custom exception.
                throw new InvalidAgeException("You are not eligible to vote.");

            }

            // Displaying the success message.
            System.out.println("You are eligible to vote.");

        }

        // Catch block to handle the custom exception.
        catch (InvalidAgeException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
