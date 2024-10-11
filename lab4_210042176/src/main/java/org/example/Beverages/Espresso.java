package org.example.Beverages;


import org.example.Condiments.ICondiments;

public class Espresso implements IBeverage
{
    ICondiments condiments;

    public Espresso(ICondiments condiments)
    {
        this.condiments=condiments;
    }
    @Override
    public String getDescription() {
        return "Espresso"+condiments.getDescription();
    }

    @Override
    public double cost() {
        return 1.99+ condiments.cost();
    }
}
