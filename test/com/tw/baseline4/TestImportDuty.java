package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestImportDuty {

    @Test
    public void shouldHaveZeroImportDutyOnNonImportedItems() {
        Item item = new Item("pencil box", 5.3, 3);
        ImportDuty importDuty = new ImportDuty(item);

        assertEquals(0.0, importDuty.importDutyApplicable(), 0.0001);
    }

    @Test
    public void shouldHaveFivePercentImportDutyOnImportedItems() {
        Item item = new Item("imported pencil box", 5.66, 2);
        ImportDuty importDuty = new ImportDuty(item);

        assertEquals(0.283, importDuty.importDutyApplicable(), 0.0001);
    }
}
