/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 22-ATM-Withdrawal-Example.java
 * Class Name  : ATMSystem
 * Topic       : ATM Withdrawal Example
 *
 * Description :
 * This program demonstrates exception handling in a simple
 * ATM withdrawal application.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ATMSystem {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the account balance.
        int accountBalance = 5000;

        // Declaring the withdrawal amount.
        int withdrawAmount = 7000;

        // Displaying the available balance.
        System.out.println("Available Balance : " + accountBalance);

        // Displaying the requested withdrawal amount.
        System.out.println("Requested Amount : " + withdrawAmount);

        // Beginning of the try block.
        try {

            // Checking whether the withdrawal amount is greater than the account balance.
            if (withdrawAmount > accountBalance) {

                // Throwing an exception.
                throw new ArithmeticException("Insufficient Balance. Transaction Failed.");

            }

            // Calculating the remaining balance.
            accountBalance = accountBalance - withdrawAmount;

            // Displaying the remaining balance.
            System.out.println("Remaining Balance : " + accountBalance);

            // Displaying the success message.
            System.out.println("Please Collect Your Cash.");

        }

        // Catch block to handle the exception.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Finally block.
        finally {

            // Displaying the thank you message.
            System.out.println("Thank You for Using Our ATM.");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
