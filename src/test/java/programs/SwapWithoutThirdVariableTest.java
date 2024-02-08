package programs;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SwapWithoutThirdVariableTest {

    @Test
    public void testSwapIntegers() {
        SwapWithoutThirdVariable swapObj = new SwapWithoutThirdVariable();
        int a = 5;
        int b = 10;

        int[] swapped = swapObj.swapIntegers(a, b);

        assertArrayEquals(new int[]{b, a}, swapped);
    }
}
