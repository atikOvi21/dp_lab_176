package org.example;

import org.example.Notifications.NotificationFactory;
import org.example.Notifications.NotificationService;
public class Trip
{
    private String id,status, noticeMethod;
    private Rider rider;
    private Driver driver;
    private RideType rideType;
    private double fare,distance;
    private String pickUpLocation, dropOffLocation;
    private NotificationFactory notice;
    private NotificationService serve;
    private TripStatus tripStatus;
    public Trip(  RideType rideType, String id, double fare, double distance , String noticeMethod)
    {

        this.rideType = rideType;
        this.id = id;
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
        this.tripStatus = TripStatus.COMPLETED;
        serve.sendNotification(rider.getRiderId(),"Started");
        serve.sendNotification(driver.getId(),"Started");
    }

    public void completeTrip()
    {
        this.tripStatus = TripStatus.COMPLETED;
        rider.makePayment(this.fare);
        serve.sendNotification(rider.getRiderId(),"Completed");
        serve.sendNotification(driver.getId(),"Started");


    }

    public String getPickUpLocation()
    {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation)
    {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation()
    {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation)
    {
        this.dropOffLocation = dropOffLocation;
    }


}
