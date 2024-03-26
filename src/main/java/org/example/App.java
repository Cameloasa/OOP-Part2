package org.example;

/**
 * Hello fast food
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // Initialize a Fries object
        Fries largeFries = new Fries(Size.LARGE,true,false);
        Fries defaultSmallFries = new Fries();
        Fries defaultMediumFries = new Fries();
        Fries defaultLargeFries = new Fries();

        System.out.println(largeFries.getDescription());
        //default
        System.out.println(defaultSmallFries.getDescription());
        System.out.println(defaultMediumFries.getDescription());
        System.out.println(defaultLargeFries.getDescription());
        //ToString
        System.out.println(largeFries.toString());

        // Create Burger object

        Burger cheeseBurger = new Burger("Cheese Burger",80," CheeseBurger",true);
        System.out.println(cheeseBurger.getDescription());


        //print out
        System.out.println("Large Fries:" + largeFries);
        System.out.println("Small Fries:" + defaultSmallFries);
        System.out.println("Cheese Burger:" + cheeseBurger);

        //we can not initialize a product from Product class because it is abstract
        //Product product = new Product("Test", 10);

        System.out.println("Large Fries:" + largeFries.calculateTax());
        System.out.println("Cheese Burger:" + cheeseBurger.calculateTax());
    }

    // call add Item method of Order Item class

    // create an object
    OrderItem orderItem = new OrderItem();





}
