package programming;
//Given a list of strings, group them by their length using streams.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {
        public static Map<Integer, List<String>> groupByLength(List<String> strings) {
            return strings.stream()
                    .collect(Collectors.groupingBy(String::length));
        }
}
