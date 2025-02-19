package Reminder_Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReminderDAO {

    // Insert a new reminder
    public static void addReminder(Reminder reminder) {
        String sql = "INSERT INTO reminders (title, description, reminder_date, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DB_Connection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, reminder.getTitle());
            stmt.setString(2, reminder.getDescription());
            stmt.setDate(3, reminder.getReminderDate());
            stmt.setString(4, reminder.getStatus());
            stmt.executeUpdate();
            System.out.println("✅ Reminder added successfully!");
        } catch (SQLException e) {
            System.err.println("❌ Error adding reminder.");
            e.printStackTrace();
        }
    }

    // Retrieve all reminders
    public static List<Reminder> getAllReminders() {
        List<Reminder> reminders = new ArrayList<>();
        String sql = "SELECT * FROM reminders";

        try (Connection conn = DB_Connection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Reminder reminder = new Reminder(
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getDate("reminder_date"),
                        rs.getString("status")
                );
                reminder.setId(rs.getInt("id"));
                reminders.add(reminder);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error fetching reminders.");
            e.printStackTrace();
        }
        return reminders;
    }

    // Update a reminder status
    public static void updateReminderStatus(int id, String status) {
        String sql = "UPDATE reminders SET status = ? WHERE id = ?";
        try (Connection conn = DB_Connection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, status);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("✅ Reminder status updated successfully!");
        } catch (SQLException e) {
            System.err.println("❌ Error updating reminder.");
            e.printStackTrace();
        }
    }

    // Delete a reminder
    public static void deleteReminder(int id) {
        String sql = "DELETE FROM reminders WHERE id = ?";
        try (Connection conn = DB_Connection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Reminder deleted successfully!");
        } catch (SQLException e) {
            System.err.println("❌ Error deleting reminder.");
            e.printStackTrace();
        }
    }
}
