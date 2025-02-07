package Exception_Handling.custom_exception;

public class Main {
    public static void main(String[] args) {
        try {
            int age = -5; 
            validateAge(age); 
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); 
        }
    }


    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!"); 
        } else if (age > 120) {
            throw new InvalidAgeException("Age is too high!"); 
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
