# try-catch Block in Exception Handling in Java

## 1. Definition

A try-catch block is a Java mechanism used to handle exceptions during program execution.
It allows the programmer to write code that may fail inside the try block and define a recovery strategy inside the catch block.

**Why it is used:**

* To prevent the program from crashing unexpectedly
* To provide meaningful error messages
* To allow the program to continue running after an error
* To improve reliability and user experience

**How it helps Java:**

* Java programs become safer and more controlled
* Developers can manage runtime problems gracefully
* It separates normal logic from error-handling logic

## 2. Basic Concept of try-catch

* **try block:** Contains code that may throw an exception
* **catch block:** Handles the exception if it occurs
* The exception object is captured in the variable written after catch

## 3. Pseudocode


```

BEGIN
TRY
execute risky code
CATCH (exception type e)
handle the exception
END TRY-CATCH
END

```

## 4. Program 1: Basic try-catch Example

### Headline:

Handling Division by Zero Using try-catch

### Purpose of the program:

This program demonstrates how to safely handle a runtime exception caused by dividing a number by zero.

### Why this program is important:

* It shows the most basic use of exception handling
* It teaches how runtime errors are caught before the program terminates
* It is a common first example in Java exception handling

### Program:

```java
public class TryCatchExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: public class TryCatchExample1 {**
* Declares a public class named TryCatchExample1.
* Every Java program must have at least one class.
* **Line 2: public static void main(String[] args) {**
* Defines the main method.
* This is the starting point of the program.
* String[] args stores command-line inputs.
* **Line 3: int a = 10;**
* Declares an integer variable a and stores 10.
* This is the numerator.
* **Line 4: int b = 0;**
* Declares an integer variable b and stores 0.
* This is the denominator.
* **Line 5: try {**
* Starts a try block.
* Code inside this block may throw an exception.
* **Line 6: int result = a / b;**
* Tries to divide a by b.
* Since b is 0, this causes ArithmeticException.
* **Line 7: System.out.println("Result: " + result);**
* Prints the result if division succeeds.
* This line will not run if the exception occurs.
* **Line 8: } catch (ArithmeticException e) {**
* Starts the catch block.
* It catches ArithmeticException thrown by the try block.
* e is the exception object.
* **Line 9: System.out.println("Error: Cannot divide by zero.");**
* Prints a friendly message instead of crashing the program.
* **Line 10: }**
* Ends the catch block.
* **Line 11: }**
* Ends the main method.
* **Line 12: }**
* Ends the class.

### Comments for every line of code:

```java
public class TryCatchExample1 {   // Declares the class name
    public static void main(String[] args) {   // Main method starts execution here
        int a = 10;   // Stores first number
        int b = 0;    // Stores second number

        try {   // Starts block where exception may occur
            int result = a / b;   // Attempts division; may throw exception
            System.out.println("Result: " + result);   // Prints result if no exception
        } catch (ArithmeticException e) {   // Handles arithmetic error
            System.out.println("Error: Cannot divide by zero.");   // Shows user-friendly message
        }
    }
}

```

### Output:

```
Error: Cannot divide by zero.

```

### Summary:

This program shows that Java can handle runtime errors without stopping the entire application.
It uses a try block to protect risky code and a catch block to respond to the error.

## 5. Program 2: try-catch with Multiple Statements

### Headline:

Handling More Than One Risky Operation in a try Block

### Purpose of the program:

This program demonstrates how multiple statements inside a single try block can be handled safely.

### Why this program is important:

* It teaches that many operations can be checked together
* It improves code organization
* It reduces repeated error-handling code

### Program:

```java
public class TryCatchExample2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[0]);
            System.out.println(numbers[3]);
            System.out.println(numbers[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}

```

### Line-by-line explanation:

* Line 1 declares the class.
* Line 2 defines the main method.
* Line 3 creates an array with 3 elements using an assignment operator (`=`).
* Line 4 is blank for readability.
* Line 5 starts try block.
* Line 6 prints first element.
* Line 7 tries to access index 3, which is invalid.
* Line 8 prints second element, but never runs because the exception happens earlier.
* Line 9 starts catch block for array out-of-bounds exception.
* Line 10 prints an error message.
* Line 11 closes catch.
* Line 12 closes main.
* Line 13 closes class.

### Comments for every line:

```java
public class TryCatchExample2 {   // Declares class
    public static void main(String[] args) {   // Entry point
        int[] numbers = {10, 20, 30};   // Array with 3 valid positions

        try {   // Start risky code section
            System.out.println(numbers[0]);   // Prints first element
            System.out.println(numbers[3]);   // Tries invalid index; exception occurs
            System.out.println(numbers[1]);   // This will not execute
        } catch (ArrayIndexOutOfBoundsException e) {   // Handles invalid index issue
            System.out.println("Error: Array index is out of bounds.");   // Prints friendly message
        }
    }
}

```

### Output:

```
10
Error: Array index is out of bounds.

```

### Summary:

This program shows how try-catch can handle errors caused by invalid array access.
It also shows that after an exception, the remaining statements in the try block are skipped.

## 6. Program 3: try-catch with User Input

### Headline:

Handling Invalid Input Using try-catch

### Purpose of the program:

This program demonstrates how to handle invalid user input when the user enters a non-numeric value.

### Why this program is important:

* It teaches real-world input validation
* It prevents the program from crashing due to wrong input
* It is useful for console-based applications

### Program:

```java
import java.util.Scanner;

public class TryCatchExample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}

```

### Line-by-line explanation:

* Import statement loads Scanner class.
* Class declaration defines program.
* Main method starts the program.
* Scanner object reads user input.
* try block protects input reading logic.
* The program asks for a number.
* nextInt() may throw an exception if input is not an integer.
* If input is valid, the value is printed.
* catch handles any exception.
* Error message is displayed when input is invalid.

### Comments for every line:

```java
import java.util.Scanner;   // Imports Scanner to read keyboard input

public class TryCatchExample3 {   // Declares the class
    public static void main(String[] args) {   // Program starts here
        Scanner input = new Scanner(System.in);   // Creates scanner object

        try {   // Starts risky code section
            System.out.print("Enter a number: ");   // Shows prompt
            int number = input.nextInt();   // Reads integer; may throw exception
            System.out.println("You entered: " + number);   // Prints valid input
        } catch (Exception e) {   // Handles any exception
            System.out.println("Please enter a valid integer.");   // Shows message for invalid input
        }
    }
}

```

### Output:

**If user enters 25:**

```
Enter a number: 25
You entered: 25

```

**If user enters abc:**

```
Enter a number: abc
Please enter a valid integer.

```

### Summary:

This program shows how try-catch helps with user input validation.
It protects the application from unexpected input and improves interaction quality.

## 7. Conclusion

The try-catch block is one of the most important concepts in Java exception handling.
It allows developers to manage problems safely and keep applications running.
A good understanding of try-catch is essential for writing professional Java programs.

```

```
