package org.example;

import java.util.List;

public class NotificationAggregatorFacade
{
    List<INotificationPlatform>SocialMediaList;
    public NotificationAggregatorFacade()
    {
        SocialMediaList.add(new FacebookAdapter(new Facebook()));
        SocialMediaList.add(new Twitter());


    }

    public  void addSocialMedia(INotificationPlatform notificationPlatform)
    {
        SocialMediaList.add(notificationPlatform);
    }

    public void markNotificationAsRead(String id , INotificationPlatform notificationPlatform)
    {
        notificationPlatform.markNotificationAsRead(id);

    }

    public void markNotificationAsUnread(String id , INotificationPlatform notificationPlatform)
    {
        notificationPlatform.markNotificationAsUnread(id);

    }

    public void deleteNotification(String id , INotificationPlatform notificationPlatform)
    {
        notificationPlatform.deleteNotification(id);
        System.out.println("Notification has been deleted!");
    }
}
