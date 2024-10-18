package org.example.EPostalService;

import org.example.NotificationSender;

public class EPostalNotificationAdapter implements NotificationSender
{
    private EPostalNotification ePostalNotification;
    private String adrress;
    public EPostalNotificationAdapter(EPostalNotification ePostalNotification)
    {
        this.ePostalNotification=ePostalNotification;
        this.adrress=ePostalNotification.address;
    }

    public void sendNotification(String receiver, String message)
    {
        System.out.println("Message "+message+" was sent to " + receiver + " having address :" + adrress);
    }


}
