# Exception Hierarchy in Java

## 1. Introduction

Java exceptions are structured in a robust class hierarchy based on object-oriented inheritance. At the peak of this structure sits the `Throwable` class, which serves as the ultimate parent for every class that represents an exceptional event or error state in the Java Virtual Machine (JVM).

---

## 2. Main Hierarchy

The structural relationships between the primary error-handling components in Java look like this:


```

Throwable
├── Error
│   ├── OutOfMemoryError
│   └── StackOverflowError
└── Exception
├── Checked Exceptions (Direct subclasses of Exception)
│   ├── IOException
│   ├── SQLException
│   └── FileNotFoundException
└── Unchecked Exceptions (Subclasses of RuntimeException)
├── ArithmeticException
├── NullPointerException
├── ArrayIndexOutOfBoundsException
└── IllegalArgumentException

```

---

## 3. Explanation of the Hierarchy

* **Throwable:** The absolute root of the Java exception architecture. Only objects that instantiate this class (or its subclasses) can be thrown by the JVM or via the manual `throw` statement.
* **Error:** A direct subclass of `Throwable` that defines problems so severe that a reasonable application should not attempt to trap or recover from them (e.g., system resource exhaustion).
* **Exception:** A direct subclass of `Throwable` that denotes conditions that a well-written application can reasonably anticipate, intercept, and handle gracefully.
* **RuntimeException:** A distinct subclass of `Exception`. This branch marks the boundary for **Unchecked Exceptions**, meaning the compiler does not validate whether you have caught or declared them at compile time.

---

## 4. Difference Between Error and Exception

| Characteristic | Error | Exception |
| :--- | :--- | :--- |
| **Recovery** | Irrecoverable. Indicates a terminal failure of the system or environment. | Recoverable. Can be caught and dealt with using custom logic blocks. |
| **Origin** | Usually triggered at the system level or inside the JVM architecture. | Usually caused by faulty programming logic or external application dependencies. |
| **Handling Rule** | Applications should never try to catch them. | Applications are encouraged to handle them using `try-catch` blocks. |
| **Examples** | `OutOfMemoryError`, `StackOverflowError` | `IOException`, `NullPointerException` |

---

## 5. Example Program

### Headline:
Catching Specific Exception Types Using Parent Classes

### Purpose of the program:
This program showcases how a specific exception type (`ArithmeticException`) maps directly to its inheritance path, allowing it to be caught using regular handling structures.

### Why this program is important:
* It proves how inheritance works inside the exception engine.
* It highlights that an exception can be trapped by its specific type or generalized to its parent classes (like `RuntimeException` or `Exception`).
* It reinforces the basic workflow of error catching using standard assignment syntaxes.

### Program:
> **Error Correction:** The variable initialization line `int result = 10 / 0;` must use the precise assignment operator (`=`) to ensure clear compilation. This is fixed in the code block below.

```java
public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        }
    }
}

```

### Line-by-line explanation:

* **Line 1: public class ExceptionHierarchyExample {**
* Opens the main demonstration class definition.


* **Line 2: public static void main(String[] args) {**
* Launches the primary execution thread.


* **Line 3: try {**
* Implements the protected block to monitor execution steps.


* **Line 4: int result = 10 / 0;**
* Runs an explicit integer division by zero, initializing the `result` variable via the assignment operator (`=`). This instantly instantiates and throws an `ArithmeticException`.


* **Line 5: System.out.println(result);**
* Terminated instantly by the JVM before execution because of the preceding arithmetic fault.


* **Line 6: } catch (ArithmeticException e) {**
* Catches the exception because the thrown object matches the specific runtime class target.


* **Line 7: System.out.println("Caught ArithmeticException");**
* Prints a confirmation message indicating the error was safely intercepted.


* **Line 8: }**
* Closes the catch handler block.



### Comments for every line:

```java
public class ExceptionHierarchyExample { // Declares the application class
    public static void main(String[] args) { // Main starting loop
        try { // Starts monitoring runtime faults
            int result = 10 / 0; // Throws an ArithmeticException via assignment operator evaluation
            System.out.println(result); // Skipped automatically upon fault triggering
        } catch (ArithmeticException e) { // Catches the specific subclass of RuntimeException
            System.out.println("Caught ArithmeticException"); // Prints safe recovery output
        }
    }
}

```

### Output:

```
Caught ArithmeticException

```

### Summary:

Because `ArithmeticException` is a standard subclass of `RuntimeException`, it flows perfectly through the matching `catch` parameter without stalling the underlying system thread.

---

## 6. Important Points

* All error handling behaviors in Java map directly to the `Throwable` hierarchy tree.
* Avoid catching generalized parent classes like `Throwable` or `Error` unless writing low-level structural code for application frameworks or logging engines.
* The division between checked and unchecked exceptions is defined purely by whether a class inherits from `RuntimeException` or directly from `Exception`.

---

## 7. Conclusion

The Java exception hierarchy provides an organized and clear framework for categorization. By structuring bugs, environmental issues, and logic errors into a predictable tree, Java ensures developers can confidently separate recoverable application situations from fatal system crashes.

```

```
