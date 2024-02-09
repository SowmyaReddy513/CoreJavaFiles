package programming;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 7, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals("List after removing duplicates should match expected value", expected, result);
    }
}
