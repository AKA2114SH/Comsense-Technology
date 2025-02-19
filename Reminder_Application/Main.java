package Reminder_Application;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📌 Reminder Management System");
            System.out.println("1. Add Reminder");
            System.out.println("2. View All Reminders");
            System.out.println("3. Update Reminder Status");
            System.out.println("4. Delete Reminder");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addReminder(scanner);
                    break;
                case 2:
                    viewReminders();
                    break;
                case 3:
                    updateReminderStatus(scanner);
                    break;
                case 4:
                    deleteReminder(scanner);
                    break;
                case 5:
                    System.out.println("✅ Exiting the application.");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Add Reminder (User Input)
    private static void addReminder(Scanner scanner) {
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Reminder Date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();
        Date reminderDate = Date.valueOf(dateInput); // Convert string to SQL Date

        System.out.print("Enter Status (Pending/Completed): ");
        String status = scanner.nextLine();

        Reminder newReminder = new Reminder(title, description, reminderDate, status);
        ReminderDAO.addReminder(newReminder);
    }

    // View All Reminders
    private static void viewReminders() {
        List<Reminder> reminders = ReminderDAO.getAllReminders();
        if (reminders.isEmpty()) {
            System.out.println("📭 No reminders found.");
        } else {
            System.out.println("\n📋 All Reminders:");
            for (Reminder r : reminders) {
                System.out.println("ID: " + r.getId() + " | Title: " + r.getTitle() +
                        " | Date: " + r.getReminderDate() + " | Status: " + r.getStatus());
            }
        }
    }

    // Update Reminder Status
    private static void updateReminderStatus(Scanner scanner) {
        System.out.print("Enter Reminder ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter new status (Pending/Completed): ");
        String status = scanner.nextLine();

        ReminderDAO.updateReminderStatus(id, status);
    }

    // Delete Reminder
    private static void deleteReminder(Scanner scanner) {
        System.out.print("Enter Reminder ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ReminderDAO.deleteReminder(id);
    }
}
