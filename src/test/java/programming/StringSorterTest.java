package programming;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class StringSorterTest {
    @Test
    public void testSortStrings() {
        String[] strings = {"apple", "banana", "orange", "kiwi", "grape", "pear"};
        String[] expected = {"pear", "kiwi", "apple", "grape", "orange", "banana"};
        StringSorter.sortStrings(strings);
        assertArrayEquals("Arrays should be sorted according to criteria", expected, strings);
    }
    @Test
    public void testSortStringsEqualLength() {
        String[] strings = {"cat", "bat", "rat", "mat", "hat", "sat"};
        String[] expected = {"cat", "bat", "rat", "mat", "hat", "sat"};
        StringSorter.sortStrings(strings);
        assertArrayEquals("Arrays should be sorted according to criteria", expected, strings);
    }
    @Test
    public void testSortStringsEmptyArray() {
        String[] strings = {};
        String[] expected = {};
        StringSorter.sortStrings(strings);
        assertArrayEquals("Empty array should remain unchanged", expected, strings);
    }
}