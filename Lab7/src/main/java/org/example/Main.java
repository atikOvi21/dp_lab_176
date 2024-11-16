package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        NotificationAggregatorFacade aggregator = new NotificationAggregatorFacade();




        INotificationPlatform facebook = aggregator.SocialMediaList.get(0);
        INotificationPlatform twitter = aggregator.SocialMediaList.get(1);

        String notificationId = "12345";


        aggregator.markNotificationAsRead(notificationId, facebook);


        aggregator.markNotificationAsUnread(notificationId, twitter);


        aggregator.deleteNotification(notificationId, facebook);
    }
}