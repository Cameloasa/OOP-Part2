package org.example;

public final class Burger extends Product{

    //Fields
    private final String type;
    private final boolean hasCheese;


    //Constructor
    public Burger(String name, double price, String type, boolean hasCheese) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Type" + type + ", Cheese :" + hasCheese;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.1;
    }


    @Override
    public String toString() {
        return "Burger{" +
                "Type=" + type +
                ", Has Cheese=" + hasCheese + '}';
    }


}
