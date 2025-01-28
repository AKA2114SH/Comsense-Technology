import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***** Student Result Calculator *****");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = Integer.parseInt(sc.nextLine());  

        System.out.print("Enter name of subject 1: ");
        String subject1 = sc.nextLine();
        System.out.print("Enter marks for " + subject1 + ": ");
        int marks1 = Integer.parseInt(sc.nextLine());  

        System.out.print("Enter name of subject 2: ");
        String subject2 = sc.nextLine();
        System.out.print("Enter marks for " + subject2 + ": ");
        int marks2 = Integer.parseInt(sc.nextLine());  

        System.out.print("Enter name of subject 3: ");
        String subject3 = sc.nextLine();
        System.out.print("Enter marks for " + subject3 + ": ");
        int marks3 = Integer.parseInt(sc.nextLine());  

        if (marks1 < 0 || marks1 > 100 || marks2 < 0 || marks2 > 100 || marks3 < 0 || marks3 > 100) {
            System.out.println("Error: Marks must be between 0 and 100.");
            sc.close();
            return;
        }

        int totalMarks = marks1 + marks2 + marks3;
        float percentage = (totalMarks / (float)(numberOfSubjects * 100)) * 100;

        System.out.println("\n***** Individual Results *****");
        System.out.println(subject1 + ": " + marks1 + " marks");
        System.out.println(subject2 + ": " + marks2 + " marks");
        System.out.println(subject3 + ": " + marks3 + " marks");

        System.out.println("\n***** Total and Percentage *****");
        System.out.println("Total Marks: " + totalMarks + "/" + (numberOfSubjects * 100));
        System.out.printf("Percentage: %.2f%%\n", percentage);

        System.out.println("\n***** Subject Grade *****");

        if (marks1 < 35) {
            System.out.println("You failed in " + subject1 + ".");
        } else if (marks1 >= 35 && marks1 < 50) {
            System.out.println(subject1 + " Grade: D");
        } else if (marks1 >= 50 && marks1 < 60) {
            System.out.println(subject1 + " Grade: C");
        } else if (marks1 >= 60 && marks1 < 75) {
            System.out.println(subject1 + " Grade: B");
        } else {
            System.out.println(subject1 + " Grade: A");
        }

        if (marks2 < 35) {
            System.out.println("You failed in " + subject2 + ".");
        } else if (marks2 >= 35 && marks2 < 50) {
            System.out.println(subject2 + " Grade: D");
        } else if (marks2 >= 50 && marks2 < 60) {
            System.out.println(subject2 + " Grade: C");
        } else if (marks2 >= 60 && marks2 < 75) {
            System.out.println(subject2 + " Grade: B");
        } else {
            System.out.println(subject2 + " Grade: A");
        }

        if (marks3 < 35) {
            System.out.println("You failed in " + subject3 + ".");
        } else if (marks3 >= 35 && marks3 < 50) {
            System.out.println(subject3 + " Grade: D");
        } else if (marks3 >= 50 && marks3 < 60) {
            System.out.println(subject3 + " Grade: C");
        } else if (marks3 >= 60 && marks3 < 75) {
            System.out.println(subject3 + " Grade: B");
        } else {
            System.out.println(subject3 + " Grade: A");
        }

        System.out.println("\n***** Overall Grade *****");
        
        if (percentage >= 60) {
            System.out.println("\nOverall Grade: First Class");
        } else if (percentage >= 35) {
            System.out.println("\nOverall Grade: Pass Class");
        } else {
            System.out.println("\nOverall Grade: Fail");
        }

        sc.close();
    }
}
