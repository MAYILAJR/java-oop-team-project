package com.university.notification;

// This demonstrates Polymorphism by providing a different implementation
public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("SMS sent to mobile " + recipient + ": " + message);
    }
}
