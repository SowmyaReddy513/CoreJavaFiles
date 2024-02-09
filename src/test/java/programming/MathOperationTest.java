package programming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationTest {

    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;
        assertEquals("Addition operation should return the sum of two numbers", 5, addition.operate(2, 3));
        assertEquals("Addition operation should return the sum of two numbers", -4, addition.operate(-6, 2));
        assertEquals("Addition operation should return the sum of two numbers", 0, addition.operate(0, 0));
        assertEquals("Addition operation should return the sum of two numbers", 100, addition.operate(50, 50));
    }
}