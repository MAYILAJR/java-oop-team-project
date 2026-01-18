package com.university.notification;

// This demonstrates Polymorphism and Inheritance
public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}
