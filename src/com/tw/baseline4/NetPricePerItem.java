//determines the net sales tax applicable on a purchased item and its net value
package com.tw.baseline4;

public class NetPricePerItem {

    private Item item;
    private BasicSalesTax basicSalesTax;
    private ImportDuty importDuty;

    public NetPricePerItem(Item item) {

        this.item = item;
        basicSalesTax = new BasicSalesTax(item);
        importDuty = new ImportDuty(item);
    }

    public double netSalesTaxPerItemCalculator() {
      return  basicSalesTax.basicSalesTaxCalculator() + importDuty.importDutyApplicable();

    }

    public double netValuePerItemCalculator() {
        return (this.netSalesTaxPerItemCalculator() + item.getItemPrice()) * item.getQuantity();
    }
}
