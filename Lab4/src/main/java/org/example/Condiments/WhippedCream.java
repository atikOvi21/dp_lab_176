package org.example.Condiments;
public class WhippedCream implements ICondiments
{
    @Override
    public String getDescription() {
        return   ", WhippedCream";
    }

    @Override
    public double cost() {
        return  10;
    }
}

