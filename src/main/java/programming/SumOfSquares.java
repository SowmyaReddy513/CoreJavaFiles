package programming;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, -3, 4, -5, 6, -7, 8, -9, 10);
            // Calculate the sum of the squares of all positive integers using streams
            int sumOfSquares = numbers.stream()
                    .filter(num -> num > 0)     // Filter out positive integers
                    .mapToInt(num -> num * num) // Square each positive integer
                    .sum();                     // Calculate the sum
            // Print the result
            System.out.println("Sum of squares of positive integers: " + sumOfSquares);
        }
}
