// class
class Student {
    String name;
    int age;
    String grade;

    // this is the cunstructor
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // method to display the values
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
// main method
public class parameterizedexample {
    public static void main(String[] args) {
    //   creating object of the class
        Student student1 = new Student("Akash", 22, "A");
        Student student2 = new Student("Priya", 21, "B");

       
        student1.displayDetails();
        student2.displayDetails();
    }
}
