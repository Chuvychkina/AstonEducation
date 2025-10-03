import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTests {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, ArithmeticOperations.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, ArithmeticOperations.factorial(1));
    }

    @Test
    public void testFactorialOfTwo() {
        assertEquals(2, ArithmeticOperations.factorial(2));
    }

    @Test
    public void testFactorialOfThree() {
        assertEquals(6, ArithmeticOperations.factorial(3));
    }

    @Test
    public void testFactorialOfFour() {
        assertEquals(24, ArithmeticOperations.factorial(4));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, ArithmeticOperations.factorial(5));
    }
}
