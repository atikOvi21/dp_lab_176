package org.example.NotificationService;

import org.example.NotificationSender;

public class NotificationService
{
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender)
    {
        this.notificationSender=notificationSender;
    }

    public void  sendMessage(String message)
    {
        notificationSender.send(message);
    }

}
