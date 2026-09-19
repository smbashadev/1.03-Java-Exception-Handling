/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 07-ArrayIndexOutOfBoundsException-Example.java
 * Class Name  : ArrayDemo
 * Topic       : ArrayIndexOutOfBoundsException Example
 *
 * Description :
 * This program demonstrates ArrayIndexOutOfBoundsException.
 * This exception occurs when an invalid index is used to access
 * an element of an array.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ArrayDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring and initializing an integer array.
        int[] numbers = {10, 20, 30, 40, 50};

        // Displaying a message before accessing the array element.
        System.out.println("Accessing the array element at index 7...");

        // Accessing an invalid array index.
        // This statement throws ArrayIndexOutOfBoundsException at runtime.
        System.out.println("Array Element = " + numbers[7]);

        // Displaying the completion message.
        // This statement will not execute.
        System.out.println("Program Completed Successfully");

    }

}
