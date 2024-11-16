package org.example;

public class FacebookAdapter implements INotificationPlatform{

    Facebook facebook ;
    public FacebookAdapter( Facebook facebook)
    {
        this.facebook=facebook;
    }

    @Override
    public void getNotifications()
    {
        facebook.getNotifications();
    }

    @Override
    public void markNotificationAsRead(String id)
    {
        facebook.markNotificationAsRead(id);
    }

    @Override
    public void markNotificationAsUnread(String id)
    {
        facebook.markNotificationAsUnread(id);
    }
}
