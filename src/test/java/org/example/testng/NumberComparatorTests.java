package org.example.testng;


import org.example.TriangleAreaCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class NumberComparatorTests {
    @Test
    public void testAreaWithPositiveValues() {
        assertEquals(TriangleAreaCalculator.area(10, 5), 25.0);
        assertEquals(TriangleAreaCalculator.area(5, 5), 12.5);
    }

    @Test
    public void testAreaWithZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(0, 5));
    }

    @Test
    public void testAreaWithZeroHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(10, 0));
    }

    @Test
    public void testAreaWithNegativeBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-10, 5));
    }

    @Test
    public void testAreaWithNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(10, -5));
    }
}
