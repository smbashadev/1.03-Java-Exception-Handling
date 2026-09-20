/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 08-NumberFormatException-Example.java
 * Class Name  : ConversionDemo
 * Topic       : NumberFormatException Example
 *
 * Description :
 * This program demonstrates NumberFormatException.
 * NumberFormatException occurs when a String containing
 * invalid numeric data is converted into a number.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class ConversionDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Declaring a String variable with non-numeric data.
        String number = "Java";

        // Displaying the String value.
        System.out.println("String Value : " + number);

        // Displaying a message before conversion.
        System.out.println("Converting String into Integer...");

        // Converting the String into an integer.
        // This statement throws NumberFormatException at runtime.
        int value = Integer.parseInt(number);

        // Displaying the converted integer value.
        // This statement will not execute.
        System.out.println("Converted Value = " + value);

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
