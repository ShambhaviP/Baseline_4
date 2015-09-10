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

    @Test
    public void shouldBeTenPercentOfThePriceForAnItemOtherThanABookOrAMedicalProductOrAFoodStuff() {
        Item item = new Item("Music CD", 3.99, 1);
        BasicSalesTax basicSalesTax = new BasicSalesTax(item);

        assertEquals(0.399, basicSalesTax.basicSalesTaxCalculator(), 0.0001);
    }

    @Test
    public void shouldBeZeroForAMedicalProduct() {
        Item item = new Item("headache pills", 1.22, 1);
        BasicSalesTax basicSalesTax = new BasicSalesTax(item);

        assertEquals(0.0, basicSalesTax.basicSalesTaxCalculator(), 0.0001);
    }

    @Test
    public void shouldBeZeroForABook() {
        Item item = new Item("book", 2.33, 1);
        BasicSalesTax basicSalesTax = new BasicSalesTax(item);

        assertEquals(0.0, basicSalesTax.basicSalesTaxCalculator(), 0.0001);
    }
}