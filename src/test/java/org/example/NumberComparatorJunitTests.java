package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberComparatorJunitTests {
    @Test
    public void testCompareEqual() {
        assertEquals(NumberComparator.compare(10, 10), 0);
        assertTrue(NumberComparator.isEqual(10, 10));
    }

    @Test
    public void testCompareGreater() {
        assertEquals(NumberComparator.compare(15, 10), 1);
        assertTrue(NumberComparator.isGreater(15, 10));
        assertFalse(NumberComparator.isGreater(10, 15));
    }

    @Test
    public void testCompareLess() {
        assertEquals(NumberComparator.compare(5, 10), -1);
        assertTrue(NumberComparator.isLess(5, 10));
        assertFalse(NumberComparator.isLess(10, 5));
    }

    @Test
    public void testIsEqualFalse() {
        assertFalse(NumberComparator.isEqual(10, 5));
    }

    @Test
    public void testMixedComparisons() {
        assertEquals(NumberComparator.compare(100, 50), 1);
        assertEquals(NumberComparator.compare(-10, 0), -1);
        assertTrue(NumberComparator.isGreater(0, -10));
    }
}
