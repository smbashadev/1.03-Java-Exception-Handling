/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 16-Throw-Keyword-Example.java
 * Class Name  : AgeValidator
 * Topic       : Throw Keyword Example
 *
 * Description :
 * This program demonstrates the use of the throw keyword.
 * The throw keyword is used to explicitly throw an exception.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class AgeValidator {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the age variable.
        int age = 16;

        // Displaying the entered age.
        System.out.println("Age : " + age);

        // Checking whether the age is less than 18.
        if (age < 18) {

            // Throwing an ArithmeticException explicitly.
            throw new ArithmeticException("You are not eligible to vote.");

        }

        // Displaying the eligibility message.
        // This statement will not execute.
        System.out.println("You are eligible to vote.");

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
