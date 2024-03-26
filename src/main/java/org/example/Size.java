package org.example;

public enum Size {
    // Fields of constant values
    SMALL(10, "Small :"),
    MEDIUM(15 , " Medium :"),
    LARGE(20 , "Large :");

    private final double price;// Have no setter method, it can make it final
    private final String name;

    //Constructor for price & Name

    Size(double price ,String name) {
        this.price = price;
        this.name = name;
    }

    //Getter for price

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
