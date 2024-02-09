package programming;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class StringOperationsTest {

    @Test
    public void testFindMaxElement() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "pear");
        String expected = "pear";

        String result = StringOperations.findMaxElement(strings);

        assertEquals("Max element based on natural sorting order should match expected value", expected, result);
    }
}
