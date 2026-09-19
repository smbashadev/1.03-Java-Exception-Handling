/*
 * ============================================================================
 * Repository  : 03-Java-Exception-Handling
 * File Name   : 02-Exception-Hierarchy.java
 * Class Name  : HierarchyDemo
 * Topic       : Exception Hierarchy in Java
 *
 * Description :
 * This program explains that every exception in Java belongs to a hierarchy.
 * It displays the names of the important classes in the Exception Hierarchy.
 *
 * Author      : Shaik Mahaboob Basha
 * ============================================================================
 */

// Declaring the class.
public class HierarchyDemo {

    // Main method. Program execution starts from here.
    public static void main(String[] args) {

        // Displaying the heading.
        System.out.println("Java Exception Hierarchy");

        // Displaying the root class.
        System.out.println("Object");

        // Displaying the Throwable class.
        System.out.println("  |");

        // Displaying Throwable.
        System.out.println("Throwable");

        // Displaying Error.
        System.out.println("  |---- Error");

        // Displaying Exception.
        System.out.println("  |---- Exception");

        // Displaying RuntimeException.
        System.out.println("         |");

        // Displaying RuntimeException.
        System.out.println("         RuntimeException");

        // Displaying ArithmeticException.
        System.out.println("              |---- ArithmeticException");

        // Displaying NullPointerException.
        System.out.println("              |---- NullPointerException");

        // Displaying ArrayIndexOutOfBoundsException.
        System.out.println("              |---- ArrayIndexOutOfBoundsException");

        // Displaying NumberFormatException.
        System.out.println("              |---- NumberFormatException");

        // Displaying completion message.
        System.out.println("\nException Hierarchy Displayed Successfully.");

    }

}
