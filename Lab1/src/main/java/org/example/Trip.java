package org.example;

public class Trip
{
    private String dropOffLocation,pickUpLocation,id,status;
    private Rider rider;
    private Driver driver;
    private RideType rideType;
    private double fare,distance;

    public Trip(String dropOffLocation, String pickUpLocation, RideType rideType, String id, String status, double fare, double distance)
    {
        this.dropOffLocation = dropOffLocation;
        this.pickUpLocation = pickUpLocation;
        this.rideType = rideType;
        this.id = id;
        this.status = status;
        this.fare = fare;
        this.distance = distance;
    }

    private double calculateFare()
    {
        return fare;
    }

    public void completeTrip() {
        this.status = "Completed";
        rider.makePayment(this.fare);
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
