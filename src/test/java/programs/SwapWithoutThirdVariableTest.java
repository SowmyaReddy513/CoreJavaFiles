package programs;

import org.junit.Test;
import static org.junit.Assert.*;

public class SwapWithoutThirdVariableTest {
    @Test
    public void testSwapWithoutTemp() {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int[] result = SwapWithoutThirdVariable.swapWithoutTemp(a, b);
        a = result[0];
        b = result[1];
        // Check if the values are swapped
        assertEquals(10, a);
        assertEquals(5, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
