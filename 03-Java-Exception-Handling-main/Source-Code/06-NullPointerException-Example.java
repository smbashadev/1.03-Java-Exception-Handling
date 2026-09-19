/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 06-NullPointerException-Example.java
 * Class Name  : StudentDemo
 * Topic       : NullPointerException Example
 *
 * Description :
 * This program demonstrates NullPointerException.
 * NullPointerException occurs when a null reference is used to
 * access an object's methods or variables.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class StudentDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring a String reference.
        String studentName = null;

        // Displaying a message before accessing the String object.
        System.out.println("Trying to display the length of the student name...");

        // Accessing the length() method using a null reference.
        // This statement throws NullPointerException at runtime.
        int length = studentName.length();

        // Displaying the length of the String.
        // This statement will not execute.
        System.out.println("Length = " + length);

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
