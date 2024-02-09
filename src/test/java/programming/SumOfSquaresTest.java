package programming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquaresOfPositiveIntegers() {
        List<Integer> numbers = Arrays.asList(1, 2, -3, 4, -5, 6, 7, -8, 9, 10);
        int expected = 1 + 4 + 16 + 36 + 49 + 81 + 100;

        int result = SumOfSquares.sumOfSquaresOfPositiveIntegers(numbers);

        assertEquals("Sum of squares of positive integers should match expected value", expected, result);
    }
}
