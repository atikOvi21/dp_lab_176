package org.example;

import org.example.EPostalService.EPostalNotification;
import org.example.EPostalService.EPostalNotificationAdapter;
import org.example.NotificationService.NotificationService;
import org.example.RegularNotificationService.EmailService;

public class Main {
    public static void main(String[] args) {

        NotificationService notify = new NotificationService( new EmailService());
        notify.sendNotification("Jalil","Checking notificaton system");
        System.out.println("\n");

        notify = new NotificationService( new EPostalNotificationAdapter(new EPostalNotification("Eskaton")));
        notify.sendNotification("Khalid","Hey!");
    }
}