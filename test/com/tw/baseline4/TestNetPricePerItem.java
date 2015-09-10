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
    public void shouldHaveNetSalesTaxEqualToBasicSalesTaxIfItemIsNotImported() {
        Item item = new Item("Music CD", 2.33, 3);
        NetPricePerItem netPricePerItem = new NetPricePerItem(item);

        assertEquals(0.233, netPricePerItem.netSalesTaxCalculator(), 0.0001);
    }
}
