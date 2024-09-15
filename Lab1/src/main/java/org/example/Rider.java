package org.example;

public class Rider
{
    private String riderId;
    private String riderName;
    private String location;
    private Double rating;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String riderId, String riderName, String location, Double rating, PaymentMethod preferredPaymentMethod) {
        this.riderId = riderId;
        this.riderName = riderName;
        this.location = location;
        this.rating = rating;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public void setPreferredPaymentMethod(PaymentMethod method)
    {
            this.preferredPaymentMethod=method;
    }

    public String getPreferredPaymentMethod()
    {
        return preferredPaymentMethod.toString();
    }

    public void  makePayment(double amount)
    {
        preferredPaymentMethod.processPayment(amount);
    }

    public void requestRide()
    {

    }

    public void rateDriver(Driver driver, double rating)
    {


    }


}
