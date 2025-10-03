package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ArithmeticOperationsTestNGTests {
    @Test
    public void testAddition() {
        assertEquals(ArithmeticOperations.performOperation(5, 3, '+'), 8.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticOperations.performOperation(5, 3, '-'), 2.0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticOperations.performOperation(5, 3, '*'), 15.0);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticOperations.performOperation(6, 2, '/'), 3.0);
    }

    @Test
    public void testDivisionByZero() {
        assertTrue(Double.isNaN(ArithmeticOperations.performOperation(5, 0, '/')));
    }

    // Дополнительный тест для неверной операции
    @Test
    public void testInvalidOperation() {
        assertTrue(Double.isNaN(ArithmeticOperations.performOperation(5, 3, 'x')));
    }
}
