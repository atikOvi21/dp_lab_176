package org.example;

public class ComboBundle extends Bundle
{
    public ComboBundle(String name)
    {
        super(name);
    }
    @Override
    public void build()
    {
        Product laptop = new Product("Laptop",1200,"Computing device" );
        productsList.add(laptop);
        System.out.println("Combo bundle1 has been built successully!");
    }
}