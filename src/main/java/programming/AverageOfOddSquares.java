package programming;

import java.util.Arrays;
//Given an array of Integers, write a program to find the average of squares of all the odd numbers.
public class AverageOfOddSquares {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0) // Filter out odd numbers
                .mapToInt(num -> num * num) // Square each odd number
                .average() // Calculate the average
                .orElse(0); // Default value if there are no odd numbers

        System.out.println("Average of squares of odd numbers: " + average);
    }
}

