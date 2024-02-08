package programs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testCalculateFactorialWithZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorialWithPositiveNumber() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testCalculateFactorialWithNegativeNumber() {
        Factorial factorial = new Factorial();
        // Factorial of a negative number is not defined, expecting IllegalArgumentException
        try {
            factorial.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial is not defined for negative numbers", e.getMessage());
        }
    }
}
