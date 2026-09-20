# Custom Exceptions in Java

## 1. Introduction

A custom exception (also known as a user-defined exception) is an exception created by the programmer. 
It is used when Java's built-in exception classes (like `IllegalArgumentException` or `NullPointerException`) do not clearly or precisely describe a specific business logic problem in the application.

---

## 2. Why Use Custom Exceptions?

* **Business Logic Mapping:** To represent domain-specific errors (e.g., `InsufficientFundsException`, `InvalidCouponCodeException`).
* **Clearer Error Messages:** To bundle meaningful contextual data along with a clean, readable diagnostic message.
* **Improved Code Maintenance:** To explicitly separate operational errors from standard system bugs or logical flaws.
* **Targeted Recovery:** To let callers catch specific domain failures distinctly and apply targeted recovery rules.

> **Real-World Scenario:** 
> If a banking application attempts to process a withdrawal that exceeds the account holder's current balance, throwing a standard `ArithmeticException` is misleading. Throwing a custom `InsufficientFundsException` describes the situation perfectly.

---

## 3. How to Create a Custom Exception

Custom exceptions are created by writing a normal class that inherits from one of the core exception classes in the Java hierarchy:

1. **Checked Custom Exception:** Inherit from `java.lang.Exception`. The compiler forces the caller to explicitly handle or declare it.
2. **Unchecked Custom Exception:** Inherit from `java.lang.RuntimeException`. The compiler does not force explicit declaration or handling.

### Syntax:

```java
// Creating a checked custom exception
class MyCustomException extends Exception {
    // Constructor that accepts a custom error message
    public MyCustomException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

```

---

## 4. Program Example

### Headline:

Creating, Throwing, and Catching a Custom Checked Exception

### Purpose of the program:

This program demonstrates how to declare a custom exception called `InvalidAgeException` to enforce a business logic validation rule during age checks.

### Why this program is important:

* It demonstrates how to create a custom error subclass.
* It shows how the `throw` and `throws` keywords cooperate to propagate custom domain exceptions.
* It highlights how caller routines intercept domain-specific failures using localized `try-catch` structures.

### Program:

> **Note:** The program code provided is structurally sound and uses clean assignment logic.

```java
// Custom Checked Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Application Class
public class CustomExceptionExample {
    // Validates business criteria and declares potential custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // Triggers the validation failure
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

```

### Line-by-line explanation:

* **Line 2: class InvalidAgeException extends Exception {**
* Defines a custom checked exception class by extending the root `Exception` class.


* **Line 3: public InvalidAgeException(String message) {**
* Sets up a constructor that takes a custom error description string.


* **Line 4: super(message);**
* Invokes the parent class constructor to wire the error string into Java's standard tracking mechanisms.


* **Line 9: public class CustomExceptionExample {**
* Declares the main public demonstration container.


* **Line 11: static void validateAge(int age) throws InvalidAgeException {**
* Defines a method that evaluates logic conditions and uses `throws` to advertise that it might emit an `InvalidAgeException`.


* **Line 12: if (age < 18) {**
* Evaluates if the input matches our core invalid validation rule.


* **Line 13: throw new InvalidAgeException("Age must be 18 or above.");**
* Manually triggers the exception using `throw` followed by the initialized exception instance.


* **Line 21: public static void main(String[] args) {**
* Main execution entry point.


* **Line 22: try {**
* Opens a guarded execution block.


* **Line 23: validateAge(15);**
* Passes an invalid input (15) which triggers the internal throw branch.


* **Line 24: } catch (InvalidAgeException e) {**
* Captures the explicit custom exception instance cleanly.


* **Line 25: System.out.println("Exception caught: " + e.getMessage());**
* Calls `getMessage()` to retrieve and print the error text.



### Comments for every line:

```java
// Defines a custom exception by extending the standard Exception class
class InvalidAgeException extends Exception { 
    // Constructor to pass error messages to the parent class
    public InvalidAgeException(String message) { 
        super(message); // Delegates error string storage to the root Exception block
    }
}

public class CustomExceptionExample { // Main execution class container
    // Validates rules and reports custom exceptions via throws signature
    static void validateAge(int age) throws InvalidAgeException { 
        if (age < 18) { // Conditional verification step
            // Halts execution path by manually injecting a custom error object
            throw new InvalidAgeException("Age must be 18 or above."); 
        } else {
            System.out.println("Valid age."); // Runs if validation rules are met
        }
    }

    public static void main(String[] args) { // Entry line for runtime thread
        try { // Starts guarded validation execution loop
            validateAge(15); // Passes faulty parameter to invoke exception logic
        } catch (InvalidAgeException e) { // catches specific custom exception instances
            // Outputs error tracking logs to the console terminal
            System.out.println("Exception caught: " + e.getMessage()); 
        }
    }
}

```

### Output:

```
Exception caught: Age must be 18 or above.

```

### Summary:

This program confirms that custom exception configurations are highly effective for mapping real-world operational rules directly into your application's error handling patterns.

---

## 5. Important Points

* **Inheritance Choices:** Always extend `Exception` for checked business failures (where recovery actions are expected) and `RuntimeException` for unchecked violations (where code adjustment is required).
* **Nomenclature:** Append the suffix `Exception` to all custom exceptions (e.g., `InvalidPaymentException`) to match standard Java naming conventions.
* **Constructor Variety:** Provide multiple constructors (such as a default constructor, one for a string message, and one that wraps an existing lower-level exception via a `Throwable cause` parameter) to build a robust API.

---

## 6. Conclusion

Custom exceptions convert abstract runtime errors into precise business-oriented language. They enrich Java applications by boosting code readability, providing descriptive error contexts, and creating highly structured recovery routines tailored to specific domain guidelines.

```

```
