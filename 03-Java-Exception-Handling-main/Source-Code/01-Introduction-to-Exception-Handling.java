/*
 * =============================================================================
 * Repository : 03-Java-Exception-Handling
 * File       : 01-Introduction-to-Exception-Handling.java
 * Class      : ExceptionDemo
 * Topic      : Introduction to Java Exception Handling
 *
 * Description:
 * This program demonstrates what happens when an exception occurs during
 * program execution. It intentionally performs division by zero to generate
 * an ArithmeticException and illustrates how the normal flow of execution
 * is interrupted.
 *
 * Author     : Shaik Mahaboob Basha
 * =============================================================================
 */

// Declaring the class.
public class ExceptionDemo {

    // Main method - execution starts from here.
    public static void main(String[] args) {

        // Displaying a message indicating that the program has started.
        System.out.println("Program Started");

        // Declaring an integer variable.
        int number = 100;

        // Declaring another integer variable with zero.
        int divisor = 0;

        // Displaying a message before performing division.
        System.out.println("Performing Division Operation...");

        // Dividing the number by zero.
        // This statement generates an ArithmeticException.
        int result = number / divisor;

        // Displaying the result.
        // This line will never execute because the exception occurs above.
        System.out.println("Result : " + result);

        // Displaying the completion message.
        // This statement will also never execute.
        System.out.println("Program Completed Successfully");
    }
}
