/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 17-Throws-Keyword-Example.java
 * Class Name  : FileDemo
 * Topic       : Throws Keyword Example
 *
 * Description :
 * This program demonstrates the use of the throws keyword.
 * The throws keyword is used to declare that a method may throw
 * one or more exceptions.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Importing the FileReader class.
import java.io.FileReader;

// Importing the IOException class.
import java.io.IOException;

// Declaring the class.
public class FileDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Calling the readFile() method.
        readFile();

        // Displaying the completion message.
        // This statement will not execute if an exception occurs.
        System.out.println("Program Completed Successfully");

    }

    // Declaring a method that may throw IOException.
    public static void readFile() throws IOException {

        // Displaying a message.
        System.out.println("Opening the File...");

        // Creating a FileReader object.
        // This statement may throw FileNotFoundException.
        FileReader reader = new FileReader("Student.txt");

        // Displaying a success message.
        System.out.println("File Opened Successfully");

        // Closing the FileReader object.
        reader.close();

    }

}
