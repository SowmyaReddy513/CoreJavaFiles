package programming;
//Write a program to remove duplicate elements from a list of integers using streams.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates{
        public static List<Integer> removeDuplicates(List<Integer> numbers) {
            return numbers.stream()
                    .distinct()
                    .collect(Collectors.toList());
        }
}

