# Multiple Catch Block in Java

## 1. Definition

A multiple catch block means using more than one catch block after a single try block.
It is used when different types of exceptions may occur in the same risky code.

**Why it is used:**

* To handle different exceptions separately
* To provide specific messages for each error type
* To improve clarity and debugging
* To make programs more professional and reliable

**How it helps Java:**

* Java allows specific exception handling instead of one generic response
* It improves code readability
* It helps developers understand what went wrong

## 2. Important Rule

* **The catch blocks must be ordered from most specific to most general.**
* If a broad exception type like `Exception` is placed first, it will catch all others (due to inheritance) and cause a compile-time error for the subsequent specific handlers because they become unreachable.

## 3. Pseudocode


```

BEGIN
TRY
perform risky operations
CATCH (specific exception 1)
handle first type
CATCH (specific exception 2)
handle second type
CATCH (general exception)
handle remaining cases
END

```

## 4. Program 1: Multiple Catch Blocks for Different Exceptions

### Headline:

Handling Different Exceptions Using Multiple catch Blocks

### Purpose of the program:

This program demonstrates how to use multiple catch blocks to handle different exception types separately.

### Why this program is important:

* It teaches how one try block may throw different exceptions
* It shows how to respond correctly to each scenario
* It helps avoid writing one large and unclear catch block

### Program:

```java
public class MultipleCatchExample1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: public class MultipleCatchExample1 {**
* Declares the class.
* **Line 2: public static void main(String[] args) {**
* Starts the main method.
* **Line 3: try {**
* Begins the try block.
* **Line 4: int a = 10;**
* Declares a variable a with value 10.
* **Line 5: int b = 0;**
* Declares b with value 0.
* **Line 6: int result = a / b;**
* Attempts division by zero, which throws `ArithmeticException`.
* **Line 7: System.out.println(result);**
* This line will not execute if exception happens.
* **Line 8:** * Blank line for readability.
* **Line 9: int[] numbers = {1, 2, 3};**
* Creates an array of size 3 using an assignment operator (`=`).
* **Line 10: System.out.println(numbers[5]);**
* This line will not run because the previous exception stops the execution.
* **Line 11: } catch (ArithmeticException e) {**
* Handles division by zero error.
* **Line 12: System.out.println("Error: Cannot divide by zero.");**
* Prints a clear message.
* **Line 13: } catch (ArrayIndexOutOfBoundsException e) {**
* Handles array index problems.
* **Line 14: System.out.println("Error: Array index is out of bounds.");**
* Prints another message.
* **Line 15: }**
* Ends catch blocks.
* **Line 16: }**
* Ends main method.
* **Line 17: }**
* Ends class.

### Comments for every line:

```java
public class MultipleCatchExample1 {   // Declares the class name
    public static void main(String[] args) {   // Starts the program execution
        try {   // Begins the block that may throw exceptions
            int a = 10;   // Stores first number
            int b = 0;    // Stores second number
            int result = a / b;   // Division by zero may throw ArithmeticException
            System.out.println(result);   // Prints result if division works

            int[] numbers = {1, 2, 3};   // Creates array with 3 elements
            System.out.println(numbers[5]);   // Accessing index 5 may throw exception
        } catch (ArithmeticException e) {   // Handles division by zero issues
            System.out.println("Error: Cannot divide by zero.");   // Prints correct message
        } catch (ArrayIndexOutOfBoundsException e) {   // Handles invalid array index
            System.out.println("Error: Array index is out of bounds.");   // Prints array-related message
        }
    }
}

```

### Output:

```
Error: Cannot divide by zero.

```

### Summary:

This program shows how more than one exception can be handled separately.
The first catch is used for arithmetic problems, and the second handles array issues.

## 5. Program 2: Multiple Catch Blocks with User Input

### Headline:

Handling Different Input Errors Using Multiple Catch Blocks

### Purpose of the program:

This program demonstrates how to handle different types of input-related issues using multiple catch blocks.

### Why this program is important:

* It teaches how to respond to bad user input in real applications
* It improves the quality of interactive programs
* It shows practical exception handling

### Program:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scan.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

```

### Line-by-line explanation:

* The first import loads `InputMismatchException`.
* The second import loads `Scanner`.
* A `Scanner` object is created using an assignment operator (`=`) to read data from the user.
* The try block contains risky input and division operations.
* If the user enters a non-integer, `InputMismatchException` is thrown.
* If the second number is zero, `ArithmeticException` is thrown.
* Each catch block prints a specific message.

### Comments for every line:

```java
import java.util.InputMismatchException;   // Imports exception for wrong input type
import java.util.Scanner;   // Imports scanner for taking user input

public class MultipleCatchExample2 {   // Declares class
    public static void main(String[] args) {   // Program starts here
        Scanner scan = new Scanner(System.in);   // Creates scanner object

        try {   // Starts risky code block
            System.out.print("Enter first number: ");   // Prompts user for first number
            int num1 = scan.nextInt();   // Reads first number; may throw InputMismatchException

            System.out.print("Enter second number: ");   // Prompts for second number
            int num2 = scan.nextInt();   // Reads second number; may throw InputMismatchException

            int result = num1 / num2;   // Division may throw ArithmeticException
            System.out.println("Result: " + result);   // Prints result if valid
        } catch (InputMismatchException e) {   // Handles invalid non-integer input
            System.out.println("Error: Please enter only integers.");   // Shows message
        } catch (ArithmeticException e) {   // Handles division by zero
            System.out.println("Error: Cannot divide by zero.");   // Shows message
        }
    }
}

```

### Output:

**If user enters 5 and 0:**

```
Error: Cannot divide by zero.

```

**If user enters a and 3:**

```
Error: Please enter only integers.

```

### Summary:

This program shows how multiple catch blocks can handle different input-related problems.
It is useful in programs where user input may be invalid or unsafe.

## 6. Conclusion

Multiple catch blocks are useful when a single try block can throw different types of exceptions.
They allow developers to respond to each problem in a more accurate and professional way.
Using multiple catch blocks makes Java programs easier to understand, maintain, and debug.

```

```
