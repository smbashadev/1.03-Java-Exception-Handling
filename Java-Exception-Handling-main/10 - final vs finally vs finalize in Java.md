# final vs finally vs finalize in Java

## 1. Introduction

In Java, `final`, `finally`, and `finalize` sound similar, but they are completely different concepts.
They are used in different situations and have different meanings.

## 2. final

### Definition:

`final` is a keyword used to restrict changes.

### Uses of final:

* **final variable:** value cannot be changed after assignment
* **final method:** method cannot be overridden
* **final class:** class cannot be inherited

### Example:

```java
final int x = 10;

```

### Important point:

`final` is related to declarations and restrictions.

## 3. finally

### Definition:

`finally` is a block used with try-catch.

### Purpose:

It always executes whether an exception occurs or not.
It is mainly used for cleanup code such as closing files or resources.

### Example:

```java
try {
    // risky code
} catch (Exception e) {
    // handle error
} finally {
    // cleanup code
}

```

### Important point:

`finally` is related to exception handling.

## 4. finalize

### Definition:

`finalize` is a method of the Object class.

### Purpose:

It is called by the garbage collector before an object is removed from memory.

### Important point:

`finalize` is not recommended for use in modern Java because it is unreliable, deprecated, and may slow down performance.

### Example:

```java
protected void finalize() throws Throwable {
    // cleanup code
}

```

## 5. Difference Table

| Keyword/Concept | Purpose | Used With | Can Be Used For |
| --- | --- | --- | --- |
| **final** | Restrict changes | variables, methods, classes | Prevent modification/inheritance |
| **finally** | Execute cleanup code | try-catch blocks | Ensure cleanup runs |
| **finalize** | Cleanup before garbage collection | objects | Old-style cleanup (not recommended) |

## 6. Simple Comparison

* **final:** constant / restriction
* **finally:** cleanup block after try-catch
* **finalize:** garbage collector hook (old concept)

## 7. Program Example

### Program:

> **Error Correction:** The variable initialization lines `final int x  10;` and `int result  100 / 2;` were missing the assignment operator (`=`). This has been corrected below.

```java
public class FinalFinallyFinalizeExample {
    public static void main(String[] args) {
        final int x = 10;

        try {
            int result = 100 / 2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("This is finally block");
        }
    }
}

```

### Output:

```
50
This is finally block

```

## 8. Conclusion

`final`, `finally`, and `finalize` are different Java concepts.

* `final` is used for restrictions.
* `finally` is used for cleanup after exception handling.
* `finalize` is a method used before object destruction, but it is rarely used today.

```

```
