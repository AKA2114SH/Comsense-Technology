
class Student {
    String name;
    int rollNo;

    // Parameterized constructor to initialize a Student object
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Constructor with Object as Parameter (Copy Constructor)
    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class cunstructor {
    public static void main(String[] args) {
        // Create and initialize student2
        Student student2 = new Student("Akash", 13);

        // Using Copy Constructor
        Student student3 = new Student(student2);

        System.out.println("\nStudent 3 (Copy Constructor):");
        student3.display();
    }
}
