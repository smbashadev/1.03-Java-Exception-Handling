/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 10-InputMismatchException-Example.java
 * Class Name  : ScannerDemo
 * Topic       : InputMismatchException Example
 *
 * Description :
 * This program demonstrates InputMismatchException.
 * InputMismatchException occurs when the user enters a value
 * of a different data type than expected.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Importing the Scanner class.
import java.util.Scanner;

// Declaring the class.
public class ScannerDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Displaying the starting message.
        System.out.println("Program Started");

        // Asking the user to enter an integer value.
        System.out.print("Enter an Integer Number : ");

        // Reading an integer value from the user.
        // This statement throws InputMismatchException
        // if the user enters a non-integer value.
        int number = scanner.nextInt();

        // Displaying the entered number.
        System.out.println("Entered Number : " + number);

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

        // Closing the Scanner object.
        scanner.close();

    }

}
