package programming;
//Find the maximum element from a list of strings using streams. Consider the maximum element based on natural sorting order.
import java.util.List;

public class StringOperations {
    public static String findMaxElement(List<String> strings) {
        return strings.stream()
                .max(String::compareTo)
                .orElse(null);
    }
}
