package org.example;
import java.util.ArrayList;
import java.util.List;

abstract class Bundle implements ProductComponent
{
    protected List<ProductComponent> productsList = new ArrayList<>();
    private String bundleName="";
    public Bundle(String name)
    {
        this.bundleName = name;
    }
    @Override
    public void display()
    {
        System.out.println("Bundle: " + bundleName);
        for (ProductComponent product : productsList)
        {
            product.display();
        }
    }
    @Override
    public double calculatePrice()
    {
        double totalPrice = 0.0;
        for (ProductComponent product : productsList)
        {
            totalPrice += product.calculatePrice();
        }
        return totalPrice;
    }
    public void addProduct(ProductComponent product)
    {
        productsList.add(product);
    }
    public abstract void build();

}