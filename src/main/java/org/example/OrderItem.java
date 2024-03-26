package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class OrderItem implements IOrderItem {

    private final String orderId ;
    private final LocalDateTime orderDate;
    private Product [] items; //[item1, item2]

    public OrderItem() {
        this.orderId = UUID.randomUUID().toString().substring(0,4);
        this.orderDate = LocalDateTime.now();
        this.items = new Product[0];
    }



    @Override
    public void addItem(Product item) {
        //Create a new array of product
        Product [] newItems = new Product[items.length + 1];
        // copy of array - method
        System.arraycopy(items,0, newItems,0,items.length);
        //we add a new item
        newItems[newItems.length -1] = item;
        //replace de ....with a new item
        items = newItems;

    }

    @Override
    public void removeItem(Product item) {

    }

    @Override
    public Product[] getItems() {
        return Arrays.copyOf(items,items.length);
    }

    @Override
    public void displayItems() {
        int counter = 1;
        for (Product item: items){
            System.out.println("Order[" + counter++ +"] -------- ");
            System.out.println(item.getDescription());

        }
        System.out.println("###############");
        System.out.println("Total Order Cost" + calculateTotal());
        System.out.println("Total Order Cost with tax" + calculateTotalWithTax());
        System.out.println("###############");

    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product item: items){
           total = total + item.getPrice();
        }
        return total;
    }

    @Override
    public double calculateTotalWithTax() {
        return 0;
    }

    public int getMaxItemNumber(){
        return MAX_ITEMS;
    }

    // Define all methods

    /*
    +calculateTotal () : double
    +calculateTotalWithTax (): double
    +displayItems()
    +addItem (product)
    +removeItem (product)
    +getItems(): Product []
     */
}
