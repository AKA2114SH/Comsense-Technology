
# Comesense Technology

Welcome to the **Comsense Technology** repository! This repository contains examples and resources for various programming concepts in Java. Whether you're a beginner or looking to refresh your knowledge, you'll find code examples for key topics in Java programming.

## 📁 Folder Structure

- **Conditionals-Statements**: Examples of conditional statements in Java.
- **Datatypes**: Examples of different data types in Java.
- **HelloWorld**: A simple "Hello, World!" program in Java.
- **Input-Output**: Examples of input and output operations in Java.
- **Loops**: Examples of loops (`for`, `while`, `do-while`) in Java.
- **Operators**: Examples of operators in Java.
- **Assignments**: Examples of methods and assignments in Java.

---

## 🚀 Java Code Examples

### 1. **Conditionals-Statements**
```java
// Example of if-else statement
public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }
    }
}
```

### 2. **Datatypes**
```java
// Example of different data types in Java
public class DataTypesExample {
    public static void main(String[] args) {
        int integerVar = 10;
        double doubleVar = 10.5;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("Integer: " + integerVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
    }
}
```

### 3. **HelloWorld**
```java
// Simple "Hello, World!" program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 4. **Input-Output**
```java
// Example of input and output operations
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

### 5. **Loops**
```java
// Example of a for loop
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

### 6. **Operators**
```java
// Example of arithmetic operators
public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```

### 7. **Assignments (Methods)**
```java
// Example of a method in Java
public class MethodExample {
    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("Sum: " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
```

---

## 🔗 Repository Link
You can access the full repository here: [Comsense Technology on GitHub](https://github.com/AKA2114SH/Comsense-Technology)

---

## 🤝 Contributing
Contributions are welcome! If you'd like to add more examples or improve existing ones, feel free to open a pull request.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

---

## 📜 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy coding! 🎉
