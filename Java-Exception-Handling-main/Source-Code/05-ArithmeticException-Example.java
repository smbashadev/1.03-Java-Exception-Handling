/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 05-ArithmeticException-Example.java
 * Class Name  : ArithmeticDemo
 * Topic       : ArithmeticException Example
 *
 * Description :
 * This program demonstrates ArithmeticException.
 * ArithmeticException occurs when an illegal arithmetic operation
 * is performed, such as dividing a number by zero.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ArithmeticDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the first integer variable.
        int number1 = 50;

        // Declaring the second integer variable.
        int number2 = 0;

        // Displaying the values before division.
        System.out.println("First Number  : " + number1);
        System.out.println("Second Number : " + number2);

        // Displaying a message before performing division.
        System.out.println("Performing Division...");

        // Performing division by zero.
        // This statement throws ArithmeticException at runtime.
        int result = number1 / number2;

        // Displaying the result.
        // This statement will not execute.
        System.out.println("Result = " + result);

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
