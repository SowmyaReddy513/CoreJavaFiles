package programming;

import org.junit.jupiter.api.Test;
import java.util.OptionalDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfOddSquaresTest {

    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        OptionalDouble result = AverageOfOddSquares.averageOfSquaresOfOddNumbers(numbers);
        assertEquals(11.0, result.getAsDouble(), 0.0001); // The average of squares of odd numbers {1, 3, 5} is 11
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersEmptyArray() {
        int[] numbers = {};
        OptionalDouble result = AverageOfOddSquares.averageOfSquaresOfOddNumbers(numbers);
        assertEquals(false, result.isPresent()); // There are no odd numbers in the array, so the result should not be present
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersNoOddNumbers() {
        int[] numbers = {2, 4, 6, 8};
        OptionalDouble result = AverageOfOddSquares.averageOfSquaresOfOddNumbers(numbers);
        assertEquals(false, result.isPresent()); // There are no odd numbers in the array, so the result should not be present
    }
}
