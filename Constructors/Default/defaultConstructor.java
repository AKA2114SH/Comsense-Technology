class Student {
    String name;
    int age;

    // Default constructor (provided by the compiler if not explicitly defined)
    Student() {
        // This constructor does nothing
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student = new Student();

        // Accessing and setting fields
        student.name = "Akash";
        student.age = 24;

        // Displaying student details
        student.display();
    }
}