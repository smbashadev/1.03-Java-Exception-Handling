/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 04-Unchecked-Exception-Example.java
 * Class Name  : DivisionDemo
 * Topic       : Unchecked Exception Example
 *
 * Description :
 * This program demonstrates an Unchecked Exception in Java.
 * An Unchecked Exception occurs during program execution and
 * is not checked by the Java compiler.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class DivisionDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring the first integer variable.
        int firstNumber = 20;

        // Declaring the second integer variable.
        int secondNumber = 0;

        // Displaying a message before performing division.
        System.out.println("Performing Division Operation...");

        // Dividing the first number by the second number.
        // This statement generates an ArithmeticException at runtime.
        int result = firstNumber / secondNumber;

        // Displaying the result.
        // This statement will not execute because the exception occurs above.
        System.out.println("Result = " + result);

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
