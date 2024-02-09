package programming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");
        List<String> expected = Arrays.asList("Apple", "Apricot", "Avocado");

        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(strings, str -> str.startsWith("A"));

        assertEquals("Filtered list should contain strings starting with 'A'", expected, filteredStrings);
    }
}