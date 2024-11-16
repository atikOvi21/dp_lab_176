package org.example;

import java.util.List;

public class Facebook
{
    List<String> NotificationList;



    public void getNotifications()
    {
        for( var message : NotificationList )
        {
            System.out.println(message);
        }
    }



    public void markNotificationAsRead(String ID)
    {

    }


    public void markNotificationAsUnread(String ID)
    {

    }


    public void deleteNotification(String ID)
    {

    }
}
