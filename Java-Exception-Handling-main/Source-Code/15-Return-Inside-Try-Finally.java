/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 15-Return-Inside-Try-Finally.java
 * Class Name  : ReturnDemo
 * Topic       : Return Statement Inside Try and Finally Block
 *
 * Description :
 * This program demonstrates that the finally block executes
 * even when a return statement is present inside the try block.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ReturnDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Calling the display() method.
        display();

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

    // Declaring a method with an integer return type.
    public static int display() {

        // Beginning of the try block.
        try {

            // Displaying a message from the try block.
            System.out.println("Inside Try Block");

            // Returning a value from the try block.
            return 100;

        }

        // Finally block.
        finally {

            // Displaying a message from the finally block.
            System.out.println("Finally Block Executed");

        }

    }

}
