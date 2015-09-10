//calculates the import duty on a purchased item as applicable
package com.tw.baseline4;

public class ImportDuty {

    private Item item;

    public ImportDuty(Item item) {
        this.item = item;
    }

    public double importDutyApplicable() {
        if(item.getItemName().contains("imported")) {
            return 0.05 * item.getItemPrice();
        }
        else {
            return 0.0;
        }
    }
}
