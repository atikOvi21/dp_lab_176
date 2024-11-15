package org.example;

import java.util.List;

public class Facebook implements  INotificationPlatform
{
    List<String> NotificationList;


    @Override
    public void getNotifications()
    {
        for( var message : NotificationList )
        {
            System.out.println(message);
        }
    }


    @Override
    public void markNotificationAsRead()
    {

    }

    @Override
    public void markNotificationAsUnread() {

    }
}
