package org.example;

public class Driver {
    private String id;
    private String name;
    private RideType vehicleType;
    private String location;
    private double rating;
    private boolean availability;

    public Driver(String id, String name, RideType vehicleType, String location, double rating, boolean availability) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.availability = availability;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void acceptRide(Trip trip)
    {

    }

    public void rateRider(Rider rider, double rating)
    {
        rider.rateDriver(this, rating);
    }

    public void updateLocation(String newLocation)
    {
        this.location = newLocation;
    }

    public void startTrip(Trip trip)
    {
        trip.startTrip();
    }



    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

 }
