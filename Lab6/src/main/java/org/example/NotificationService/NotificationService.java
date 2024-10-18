package org.example.NotificationService;

import org.example.NotificationSender;

public class NotificationService
{
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender)
    {
        this.notificationSender=notificationSender;
    }

    public void  sendNotification(String recipient , String message)
    {
        notificationSender.sendNotification(recipient , message);
    }

}
