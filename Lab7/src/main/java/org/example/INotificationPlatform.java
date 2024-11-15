package org.example;

public interface INotificationPlatform
{
    void getNotifications();
    void markNotificationAsRead(String id);
    void markNotificationAsUnread(String id);

}
