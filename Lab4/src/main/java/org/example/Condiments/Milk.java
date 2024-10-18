package org.example.Condiments;


public class Milk implements ICondiments
{

    @Override
    public String getDescription() {
        return   ", Milk";
    }

    @Override
    public double cost() {
        return  0.330;
    }
}

