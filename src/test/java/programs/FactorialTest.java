package programs;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(24, Factorial.calculateFactorial(4));
        assertEquals(120, Factorial.calculateFactorial(5));
        assertEquals(720, Factorial.calculateFactorial(6));
        // Add more test cases as needed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialNegativeNumber() {
        Factorial.calculateFactorial(-1);
    }
}
