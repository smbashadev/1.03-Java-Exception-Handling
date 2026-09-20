/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 19-Custom-Exception-Example.java
 * Class Name  : BankDemo
 * Topic       : Custom Exception Example
 *
 * Description :
 * This program demonstrates how to create and use a custom exception
 * in Java. A custom exception is created by extending the Exception class.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring a custom exception class.
class InsufficientBalanceException extends Exception {

    // Creating a constructor for the custom exception.
    public InsufficientBalanceException(String message) {

        // Passing the message to the parent Exception class.
        super(message);

    }

}

// Declaring the main class.
public class BankDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the account balance.
        int accountBalance = 5000;

        // Declaring the withdrawal amount.
        int withdrawAmount = 7000;

        // Displaying the account balance.
        System.out.println("Account Balance : " + accountBalance);

        // Displaying the withdrawal amount.
        System.out.println("Withdraw Amount : " + withdrawAmount);

        // Beginning of the try block.
        try {

            // Checking whether the withdrawal amount is greater than the balance.
            if (withdrawAmount > accountBalance) {

                // Throwing the custom exception.
                throw new InsufficientBalanceException("Insufficient Account Balance.");

            }

            // Displaying the success message.
            System.out.println("Amount Withdrawn Successfully.");

        }

        // Catch block to handle the custom exception.
        catch (InsufficientBalanceException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
