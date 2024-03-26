package org.example;

public interface IOrderItem {

    //we can define abstract methods or abstract fields

    /*
    +calculateTotal () : double
    +calculateTotalWithTax (): double
    +displayItems()
    +addItem (product)
    +removeItem (product)
    +getItems(): Product []
     */

    int MAX_ITEMS = 10;

    void addItem(Product item);

    void removeItem(Product item);

    Product [] getItems();
    void displayItems();
    double calculateTotal();
    double calculateTotalWithTax();
}
