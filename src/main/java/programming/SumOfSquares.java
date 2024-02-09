package programming;
//Calculate the sum of the squares of all positive integers in a given list using streams.
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static int sumOfSquaresOfPositiveIntegers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .mapToInt(num -> num * num)
                .sum();
    }
}
