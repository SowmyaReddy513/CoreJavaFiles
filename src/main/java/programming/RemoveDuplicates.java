package programming;
//Write a program to remove duplicate elements from a list of integers using streams.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9);
        // Remove duplicates using streams
        List<Integer> uniqueList = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        // Print the result
        System.out.println("Original List: " + integerList);
        System.out.println("List without duplicates: " + uniqueList);
    }
}

