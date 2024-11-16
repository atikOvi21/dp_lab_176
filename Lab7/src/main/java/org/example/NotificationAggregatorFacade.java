package org.example;

import java.util.HashMap;

public class NotificationAggregatorFacade
{
    HashMap<String, INotificationPlatform> SocialMediaList = new HashMap<>();
    public NotificationAggregatorFacade()
    {
        SocialMediaList.put("Facebook" ,new FacebookAdapter(new Facebook()));
        SocialMediaList.put("Twitter" , new Twitter());


    }

    public  void addSocialMedia(INotificationPlatform notificationPlatform, String PlatformName)
    {
        SocialMediaList.put(PlatformName,notificationPlatform);
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
