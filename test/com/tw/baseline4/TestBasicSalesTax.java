package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBasicSalesTax {

    @Test
    public void shouldBeZeroIfTheItemPurchasedIsAFood() {
        Item item = new Item("chocolate", 0.75, 1);
        BasicSalesTax basicSalesTax = new BasicSalesTax(item);

        assertEquals(0.0, basicSalesTax.basicSalesTaxCalculator(), 0.0001);
    }
}
