package programming;
//Given a list of strings, group them by their length using streams.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "pear", "grape", "kiwi");

        // Group strings by their length using streams
        Map<Integer, List<String>> groupedByLength = stringList.stream()
                .collect(Collectors.groupingBy(String::length));

        // Print the result
        groupedByLength.forEach((length, strings) ->
                System.out.println("Strings with length " + length + ": " + strings));
    }
}
