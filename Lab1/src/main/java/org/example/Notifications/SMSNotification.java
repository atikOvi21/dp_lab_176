package org.example.Notifications;

public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String userId, String message)
    {
         System.out.println("Sending SMS to user " + userId + ": " + message);
    }
}
