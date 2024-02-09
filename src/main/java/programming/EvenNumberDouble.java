package programming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Given a list of integers, filter out the even numbers and then double each remaining number using streams.
public class EvenNumberDouble {
        public static List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(num -> num % 2 == 0)
                    .map(num -> num * 2)
                    .collect(Collectors.toList());
        }
}