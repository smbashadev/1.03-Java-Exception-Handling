/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 03-Checked-Exception-Example.java
 * Class Name  : FileReadingDemo
 * Topic       : Checked Exception Example
 *
 * Description :
 * This program demonstrates a Checked Exception in Java.
 * A Checked Exception is verified by the compiler and must be
 * either handled using try-catch or declared using the throws keyword.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Importing the File class.
import java.io.File;

// Importing the FileReader class.
import java.io.FileReader;

// Declaring the class.
public class FileReadingDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Creating a File object.
        File file = new File("Student.txt");

        // Displaying the file name.
        System.out.println("File Name : " + file.getName());

        // Displaying an informational message.
        System.out.println("Trying to open the file...");

        // The following statement generates a Checked Exception.
        // Since FileReader may throw FileNotFoundException,
        // the compiler reports an error if it is not handled.
        FileReader reader = new FileReader(file);

        // This statement will execute only if the file is opened successfully.
        System.out.println("File Opened Successfully");

        // Displaying the ending message.
        System.out.println("Program Ended");

    }

}
