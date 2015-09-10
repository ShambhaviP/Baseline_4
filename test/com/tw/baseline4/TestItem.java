package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItem {

    @Test
    public void shouldHaveAValidPrice() {
        Item item = new Item("Pencil", 0.12, 2);

        assertEquals(0.12, item.getItemPrice(), 0.0001);

    }

    @Test
    public void shouldHaveAValidQuantity() {
        Item item = new Item("Music CD", 12.50, 1);

        assertEquals(1, item.getQuantity());
    }
}
