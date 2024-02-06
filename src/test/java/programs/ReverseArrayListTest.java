package programs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseArrayListTest {

    @Test
    public void testReverseArrayList() {
        ReverseArrayList reverseArrayList = new ReverseArrayList();

        // Test case 1: Reverse an ArrayList of integers
        ArrayList<Integer> inputList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expectedOutput1 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(expectedOutput1, reverseArrayList.reverseArrayList(inputList1));

        // Test case 2: Reverse an empty ArrayList
        ArrayList<Integer> inputList2 = new ArrayList<>();
        ArrayList<Integer> expectedOutput2 = new ArrayList<>();
        assertEquals(expectedOutput2, reverseArrayList.reverseArrayList(inputList2));

        // Test case 3: Reverse an ArrayList with repeated elements
        ArrayList<Integer> inputList3 = new ArrayList<>(Arrays.asList(1, 2, 1, 4, 1));
        ArrayList<Integer> expectedOutput3 = new ArrayList<>(Arrays.asList(1, 4, 1, 2, 1));
        assertEquals(expectedOutput3, reverseArrayList.reverseArrayList(inputList3));
    }
}

