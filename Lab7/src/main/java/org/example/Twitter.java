package org.example;

import java.util.List;




    public class Twitter implements  INotificationPlatform
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
        public void markNotificationAsRead(String ID)
        {

        }

        @Override
        public void markNotificationAsUnread(String ID)
        {

        }


        public void deleteNotification(String ID)
        {

        }
    }


