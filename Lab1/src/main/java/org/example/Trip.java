package org.example;

import org.example.Notifications.NotificationFactory;
import org.example.Notifications.NotificationService;
public class Trip
{
    private String dropOffLocation,pickUpLocation,id,status, noticeMethod;
    private Rider rider;
    private Driver driver;
    private RideType rideType;
    private double fare,distance;
    private NotificationFactory notice;
    private NotificationService serve;
    public Trip(String dropOffLocation, String pickUpLocation, RideType rideType, String id, String status, double fare, double distance , String noticeMethod)
    {
        this.dropOffLocation = dropOffLocation;
        this.pickUpLocation = pickUpLocation;
        this.rideType = rideType;
        this.id = id;
        this.status = status;
        this.fare = fare;
        this.distance = distance;
        notice=new NotificationFactory();
        serve = notice.getNotificationService(noticeMethod);
    }

    private double calculateFare()
    {
        return fare;
    }

    public void startTrip()
    {
        this.status = "In Progress";
        serve.sendNotification(rider.getRiderId(),"Started");
        serve.sendNotification(driver.getId(),"Started");
    }

    public void completeTrip()
    {
        this.status = "Completed";
        rider.makePayment(this.fare);
        serve.sendNotification(rider.getRiderId(),"Completed");
        serve.sendNotification(driver.getId(),"Started");


    }

    public String getPickUpLocation()
    {
        return pickUpLocation;
    }

    public void setPickUpLocation() {

     }

    public String getDropOffLocation(String location)
    {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation)
    {
        this.dropOffLocation = dropOffLocation;
    }


}
