package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNetPricePerItem {

    @Test
    public void shouldHaveNetSalesTaxPerItemGreaterThanOrEqualToZero() {
        Item item = new Item("chocolate", 0.99, 2);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.0, netPricePerItem.netSalesTaxCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToBasicSalesTaxIfItemIsNotImported() {
        Item item = new Item("Music CD", 2.33, 3);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.233, netPricePerItem.netSalesTaxCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToImportDutyIfItemIsImportedAndIsAFoodItem() {
        Item item = new Item("imported chocolate", 5.66, 1);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.283, netPricePerItem.netSalesTaxCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToTheSumOfBasicSalesTaxAndImportDutyIfItemIsImportedAndNotExemptedFromBasicSalesTax() {
        Item item = new Item("imported bottle of perfume", 5.66, 1);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.849, netPricePerItem.netSalesTaxCalculator(), 0.0001);
    }
}
