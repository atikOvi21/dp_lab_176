package org.example.Notifications;

public class InAppNotification implements NotificationService {

    @Override
    public void sendNotification(String userId, String message) {
         System.out.println("Sending In-App message to user " + userId + ": " + message);
    }
}
