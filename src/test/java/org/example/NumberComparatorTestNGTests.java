package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparatorTestNGTests {
    @Test
    public void testGreaterThan() {
        assertEquals(NumberComparator.compareNumbers(5, 3), "5 больше 3");
    }

    @Test
    public void testLessThan() {
        assertEquals(NumberComparator.compareNumbers(3, 5), "3 меньше 5");
    }

    @Test
    public void testEqual() {
        assertEquals(NumberComparator.compareNumbers(5, 5), "5 равно 5");
    }

    @Test
    public void testGreaterThanWithNegatives() {
        assertEquals(NumberComparator.compareNumbers(-1, -5), "-1 больше -5");
    }

    @Test
    public void testEqualWithZeros() {
        assertEquals(NumberComparator.compareNumbers(0, 0), "0 равно 0");
    }
}
