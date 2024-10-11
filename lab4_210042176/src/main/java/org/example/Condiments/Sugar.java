package org.example.Condiments;
import org.example.Beverages.IBeverage;


public class Sugar implements ICondiments
{

    @Override
    public String getDescription() {
        return   ", Sugar";
    }

    @Override
    public double cost() {
        return  0.331;
    }
}


