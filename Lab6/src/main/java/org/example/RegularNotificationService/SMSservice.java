package org.example.RegularNotificationService;

import org.example.NotificationSender;

public class SMSservice implements NotificationSender
{
    public void sendNotification(String receiver, String message)
    {
        System.out.println("Message "+message+ " sent to "+receiver);
    }
}
