/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 23-File-Handling-Exception-Example.java
 * Class Name  : FileOperation
 * Topic       : File Handling Exception Example
 *
 * Description :
 * This program demonstrates how to handle file-related exceptions
 * using try-catch. If the specified file is not found, the program
 * catches the exception and displays a user-friendly message.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Importing the FileReader class.
import java.io.FileReader;

// Importing the FileNotFoundException class.
import java.io.FileNotFoundException;

// Declaring the class.
public class FileOperation {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Beginning of the try block.
        try {

            // Displaying a message.
            System.out.println("Opening the File...");

            // Creating a FileReader object.
            // This line throws FileNotFoundException if the file does not exist.
            FileReader file = new FileReader("Student.txt");

            // Displaying a success message.
            System.out.println("File Opened Successfully.");

            // Closing the file.
            file.close();

        }

        // Catch block to handle FileNotFoundException.
        catch (FileNotFoundException exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Catch block to handle any other exceptions.
        catch (Exception exception) {

            // Displaying the exception message.
            System.out.println("Exception Caught : " + exception.getMessage());

        }

        // Finally block.
        finally {

            // Displaying the finally block message.
            System.out.println("File Operation Completed.");

        }

        // Displaying the completion message.
        System.out.println("Program Completed Successfully");

    }

}
