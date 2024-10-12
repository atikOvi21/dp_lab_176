package org.example;

class Product implements ProductComponent
{
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}