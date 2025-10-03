package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaCalculatorTestNGTests {
    @Test
    public void testPositiveNumbers() {
        assertEquals(TriangleAreaCalculator.triangleArea(10.0, 5.0), 25.0, 0.001);
    }

    @Test
    public void testZeroBase() {
        assertEquals(TriangleAreaCalculator.triangleArea(0.0, 5.0), 0.0, 0.001);
    }

    @Test
    public void testZeroHeight() {
        assertEquals(TriangleAreaCalculator.triangleArea(10.0, 0.0), 0.0, 0.001);
    }

    @Test
    public void testFractionalNumbers() {
        assertEquals(TriangleAreaCalculator.triangleArea(3.5, 4.0), 7.0, 0.001);
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(TriangleAreaCalculator.triangleArea(1000.0, 2000.0), 1000000.0, 0.001);
    }
}
