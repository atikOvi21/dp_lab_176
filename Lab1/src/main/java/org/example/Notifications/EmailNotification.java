package org.example.Notifications;


public class EmailNotification implements NotificationService
{

    @Override
    public void sendNotification(String userId, String message)
    {
         System.out.println("Sending In-App message to user " + userId + ": " + message);
    }
}
