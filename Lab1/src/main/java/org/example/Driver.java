package org.example;

public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean availability;


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
        trip.start();
    }



    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

 }
