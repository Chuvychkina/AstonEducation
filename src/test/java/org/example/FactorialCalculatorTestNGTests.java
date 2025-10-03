package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialCalculatorTestNGTests {
    @Test
    public void testFactorialZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test
    public void testFactorialTwo() {
        assertEquals(FactorialCalculator.factorial(2), 2);
    }

    @Test
    public void testFactorialThree() {
        assertEquals(FactorialCalculator.factorial(3), 6);
    }

    @Test
    public void testFactorialFour() {
        assertEquals(FactorialCalculator.factorial(4), 24);
    }
}
