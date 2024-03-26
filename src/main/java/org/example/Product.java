package org.example;

public abstract class Product extends Object {

    // Fields -private

    private String name;
    private double price;


    //Constructors


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    // Getters and setters

    // Just getters because we don't want to change price and name


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    // Setter just for name because sometimes we need chance it

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException(" Name is null");
        this.name = name;
    }

    // Methods
    public String getDescription() {
        return "Item :" + name + ", Price : SEK" + price;
    }

    // Method for calculate price - method doesn't have logic,we need to make this method abstract
    public abstract double calculateTax();
}