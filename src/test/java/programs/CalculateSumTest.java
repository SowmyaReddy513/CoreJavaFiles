package programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculateSumTest {

    @Test
    public void testCalculateArraySum() {
        CalculateSum calculateSum = new CalculateSum();

        // Test case 1: Sum of positive integers
        int[] inputArray1 = {1, 2, 3, 4, 5};
        assertEquals(15, calculateSum.calculateArraySum(inputArray1));

        // Test case 2: Sum of negative integers
        int[] inputArray2 = {-1, -2, -3, -4, -5};
        assertEquals(-15, calculateSum.calculateArraySum(inputArray2));

        // Test case 3: Sum of mixed positive and negative integers
        int[] inputArray3 = {1, -2, 3, -4, 5};
        assertEquals(3, calculateSum.calculateArraySum(inputArray3));

        // Test case 4: Sum of an empty array
        int[] inputArray4 = {};
        assertEquals(0, calculateSum.calculateArraySum(inputArray4));

        // Test case 5: Sum of an array with a single element
        int[] inputArray5 = {10};
        assertEquals(10, calculateSum.calculateArraySum(inputArray5));
    }
}
