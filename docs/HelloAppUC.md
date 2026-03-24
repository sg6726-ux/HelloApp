# HelloApp Use Case Documentation

---

## UC1: Display Hello World

### Description
In this use case, the program prints a simple message "Hello World" on the console.  
This is the first step of the HelloApp project and helps verify that the Java environment and project setup are working correctly.

### Disadvantages of Previous Use Case
There is no previous use case since this is the starting point of the application.

### Preconditions
- Java should be installed on the system.
- Maven should be installed and configured.
- The project structure should be created.
- The HelloApp.java file should be present inside the `src/main/java` folder.

### Main Flow
1. The program starts running.
2. The `main()` method of the HelloApp class is executed.
3. The program prints the message **"Hello World"** to the console.

### Post Conditions
- The message "Hello World" is displayed in the console.
- It confirms that the program runs successfully.

### Hints
- Use `System.out.println()` to print output in Java.
- Make sure the class contains the correct `main()` method.

### Code Example

```java
public class HelloApp {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}

### Concepts Learned
Basic structure of a Java program
How the main() method works
Printing output using System.out.println()