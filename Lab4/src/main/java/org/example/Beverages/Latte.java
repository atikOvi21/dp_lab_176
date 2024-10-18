package org.example.Beverages;


import org.example.Condiments.ICondiments;

public class Latte implements IBeverage
{
    ICondiments condiments;

    public Latte(ICondiments condiments)
    {
        this.condiments=condiments;
    }
    @Override
    public String getDescription() {
        return "Latte"+condiments.getDescription();
    }

    @Override
    public double cost() {
        return 1.99+ condiments.cost();
    }
}
