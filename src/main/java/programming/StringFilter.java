package programming;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//implement a method that takes a list of strings and a predicate (using a lambda expression) to filter out strings starting with the letter "A".
public class StringFilter {
        public static List<String> filterStringsStartingWithA(List<String> strings, Predicate<String> predicate) {
            List<String> filteredStrings = new ArrayList<>();
            for (String str : strings) {
                if (predicate.test(str)) {
                    filteredStrings.add(str);
                }
            }
            return filteredStrings;
        }
}
