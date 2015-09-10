//to instantiate purchased items with their names,prices,and quantity
package com.tw.baseline4;

public class Item {
    
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public Item(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
