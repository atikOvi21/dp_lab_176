package org.example;

public class Rider
{
    private String riderId;
    private String riderName;
    private String location;
    private Double rating;
    private PaymentMethod preferredPaymentMethod;


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
