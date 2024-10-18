package org.example;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending Email to " + receiver + " with message: " + message);
    }
}

