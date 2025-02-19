package Reminder_Application;

import java.sql.Date;

public class Reminder {
    private int id;
    private String title;
    private String description;
    private Date reminderDate;
    private String status;

    // Constructor for creating a new reminder (without ID, for inserting into DB)
    public Reminder(String title, String description, Date reminderDate, String status) {
        this.title = title;
        this.description = description;
        this.reminderDate = reminderDate;
        this.status = status;
    }

    // Constructor for retrieving reminders from DB (includes ID)
    public Reminder(int id, String title, String description, Date reminderDate, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.reminderDate = reminderDate;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
