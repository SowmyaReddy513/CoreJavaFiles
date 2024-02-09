package programming;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class EvenNumberDoubleTest {

    @Test
    public void testFilterAndDoubleEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(4, 8, 12, 16, 20);

        List<Integer> result = EvenNumberDouble.filterAndDoubleEvenNumbers(numbers);

        assertEquals("Filtered and doubled even numbers should match expected values", expected, result);
    }
}
