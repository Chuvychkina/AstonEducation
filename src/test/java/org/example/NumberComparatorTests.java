package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTests {
    @Test
    public void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(10, 10));
        assertTrue(NumberComparator.isEqual(10, 10));
    }

    @Test
    public void testCompareGreater() {
        assertEquals(1, NumberComparator.compare(15, 10));
        assertTrue(NumberComparator.isGreater(15, 10));
        assertFalse(NumberComparator.isGreater(10, 15));
    }

    @Test
    public void testCompareLess() {
        assertEquals(-1, NumberComparator.compare(5, 10));
        assertTrue(NumberComparator.isLess(5, 10));
        assertFalse(NumberComparator.isLess(10, 5));
    }

    @Test
    public void testIsEqualFalse() {
        assertFalse(NumberComparator.isEqual(10, 5));
    }

    @Test
    public void testMixedComparisons() {
        assertEquals(1, NumberComparator.compare(100, 50));
        assertEquals(-1, NumberComparator.compare(-10, 0));
        assertTrue(NumberComparator.isGreater(0, -10));
    }
}
