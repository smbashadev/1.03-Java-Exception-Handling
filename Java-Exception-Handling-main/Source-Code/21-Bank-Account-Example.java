/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 21-Bank-Account-Example.java
 * Class Name  : BankAccount
 * Topic       : Bank Account Example
 *
 * Description :
 * This program demonstrates exception handling in a simple
 * bank account withdrawal application.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class BankAccount {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the account balance.
        int accountBalance = 10000;

        // Declaring the withdrawal amount.
        int withdrawAmount = 12000;

        // Displaying the available balance.
        System.out.println("Account Balance : " + accountBalance);

        // Displaying the withdrawal amount.
        System.out.println("Withdraw Amount : " + withdrawAmount);

        // Beginning of the try block.
        try {

            // Checking whether the withdrawal amount is greater than the balance.
            if (withdrawAmount > accountBalance) {

                // Throwing an exception.
                throw new ArithmeticException("Insufficient Balance.");

            }

            // Calculating the remaining balance.
            accountBalance = accountBalance - withdrawAmount;

            // Displaying the remaining balance.
            System.out.println("Remaining Balance : " + accountBalance);

        }

        // Catch block to handle the exception.
        catch (ArithmeticException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Finally block.
        finally {

            // Displaying the finally block message.
            System.out.println("Thank You for Banking With Us.");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
