/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 18-Exception-Propagation-Example.java
 * Class Name  : PropagationDemo
 * Topic       : Exception Propagation Example
 *
 * Description :
 * This program demonstrates Exception Propagation in Java.
 * An exception generated in one method is propagated to the
 * calling method when it is not handled.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class PropagationDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Calling methodOne().
        methodOne();

        // Displaying the completion message.
        // This statement will not execute because the exception
        // is not handled.
        System.out.println("Program Completed Successfully");

    }

    // Declaring the first method.
    public static void methodOne() {

        // Displaying a message.
        System.out.println("Inside Method One");

        // Calling methodTwo().
        methodTwo();

    }

    // Declaring the second method.
    public static void methodTwo() {

        // Displaying a message.
        System.out.println("Inside Method Two");

        // Calling methodThree().
        methodThree();

    }

    // Declaring the third method.
    public static void methodThree() {

        // Displaying a message.
        System.out.println("Inside Method Three");

        // Declaring the first integer variable.
        int firstNumber = 100;

        // Declaring the second integer variable.
        int secondNumber = 0;

        // Performing division by zero.
        // This statement generates ArithmeticException.
        int result = firstNumber / secondNumber;

        // Displaying the result.
        // This statement will not execute.
        System.out.println("Result = " + result);

    }

}
