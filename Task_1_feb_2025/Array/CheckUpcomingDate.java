package Array;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckUpcomingDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd):");
        String inputDate = scanner.next();
        LocalDate userDate = LocalDate.parse(inputDate, DateTimeFormatter.ISO_DATE);
        LocalDate currentDate = LocalDate.now();

        if (userDate.isAfter(currentDate)) {
            System.out.println("The date is upcoming.");
        } else {
            System.out.println("The date is not upcoming.");
        }
    }
}
