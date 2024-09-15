package org.example.Notifications;

public class NotificationFactory
{
    public static NotificationService getNotificationService(String preferredMethod )
    {
        switch (preferredMethod)
        {
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            case "InApp":
                return new InAppNotification();
            default:
                throw new IllegalArgumentException("Unknown notification method: " + preferredMethod);
        }
    }
}
