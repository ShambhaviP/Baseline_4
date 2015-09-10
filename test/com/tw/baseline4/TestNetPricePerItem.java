package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNetPricePerItem {

    @Test
    public void shouldHaveNetSalesTaxPerItemGreaterThanOrEqualToZero() {
        Item item = new Item("chocolate", 0.99, 2);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.0, netPricePerItem.netSalesTaxPerItemCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToBasicSalesTaxIfItemIsNotImported() {
        Item item = new Item("Music CD", 2.33, 3);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.233, netPricePerItem.netSalesTaxPerItemCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToImportDutyIfItemIsImportedAndIsAFoodItem() {
        Item item = new Item("imported chocolate", 5.66, 1);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.283, netPricePerItem.netSalesTaxPerItemCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetSalesTaxPerItemEqualToTheSumOfBasicSalesTaxAndImportDutyIfItemIsImportedAndNotExemptedFromBasicSalesTax() {
        Item item = new Item("imported bottle of perfume", 5.66, 1);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.849, netPricePerItem.netSalesTaxPerItemCalculator(), 0.0001);
    }

    @Test
    public void shouldHaveNetPricePerItemEqualToTheSumOfNetSalesTaxApplicableAndOriginalPriceMultipliedByItemQuantity() {
        Item item = new Item("imported bottle of perfume", 5.66, 1);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(6.509, netPricePerItem.netValuePerItemCalculator(), 0.0001);
    }
}
