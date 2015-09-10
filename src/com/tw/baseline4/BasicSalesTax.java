//to calculate the basic sales tax on a purchased item as applicable
package com.tw.baseline4;

public class BasicSalesTax {

    private Item item;

    public BasicSalesTax(Item item) {
        this.item = item;
    }

    public double basicSalesTaxCalculator() {
        if(item.getItemName().contains("chocolate")) {
            return 0.0;
        }
        if(item.getItemName().contains("headache pills")) {
            return 0.0;
        }
        if(item.getItemName().contains("book")) {
            return 0.0;
        }
        else {
            return 0.1 * item.getItemPrice();
        }
    }
}
