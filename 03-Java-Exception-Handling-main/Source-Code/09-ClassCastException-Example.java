/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 09-ClassCastException-Example.java
 * Class Name  : CastingDemo
 * Topic       : ClassCastException Example
 *
 * Description :
 * This program demonstrates ClassCastException.
 * ClassCastException occurs when an object is incorrectly
 * type cast into an incompatible class.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class CastingDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the starting message.
        System.out.println("Program Started");

        // Creating an Object reference and storing a String object.
        Object object = "Java Programming";

        // Displaying the object value.
        System.out.println("Object Value : " + object);

        // Displaying a message before type casting.
        System.out.println("Casting Object into Integer...");

        // Type casting the Object reference into Integer.
        // This statement throws ClassCastException at runtime.
        Integer number = (Integer) object;

        // Displaying the Integer value.
        // This statement will not execute.
        System.out.println("Number = " + number);

        // Displaying the completion message.
        // This statement will also not execute.
        System.out.println("Program Completed Successfully");

    }

}
