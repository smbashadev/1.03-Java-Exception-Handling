# Exception vs Error in Java

## 1. Exception
- An exception is a problem that occurs during program execution.
- It is usually caused by invalid input, file issues, network problems, or bad logic.
- Exceptions are often handled by the programmer using try-catch.
- Example: ArithmeticException, NullPointerException, IOException

## 2. Error
- An error indicates a serious problem that usually cannot be recovered from.
- It is generally caused by the environment or system resources, not normal program logic.
- Errors are normally not handled by the application.
- Example: OutOfMemoryError, StackOverflowError, VirtualMachineError

## 3. Main Difference
- Exception: recoverable / can be handled
- Error: unrecoverable / should not be handled in normal code

## 4. Example
public class ExceptionVsError {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Handled exception: " + e.getMessage());
        }

        // This is an error example (not recommended to catch)
        // int[] arr = new int[1000000000];
    }
}

## 5. Quick Summary
- Exceptions are expected problems that can be managed.
- Errors are serious system-level problems that usually crash the program.
