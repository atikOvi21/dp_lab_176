package org.example;

public class Bundlers
{
    public static void main(String[] args)
    {
        Product monitor = new Product("Monitor", 1200.0, "Good performance!");
        Product phone = new Product("Phone", 800.0, "Latest smartphone");
        Product laptop = new Product("HP",123,"Gaming at fullest");

        ComboBundle holidayGiftBasket = new ComboBundle("Holiday Gift Basket");
        holidayGiftBasket.build();
        holidayGiftBasket.display();


        ComboBundle techBundle = new ComboBundle("Tech Bundle");
        techBundle.addProduct(holidayGiftBasket);
        techBundle.addProduct(monitor);
        techBundle.addProduct(phone);
        techBundle.build();
        double totalPrice = techBundle.calculatePrice();
        System.out.println("Total Price: $" + totalPrice);
        techBundle.display();



    }
}