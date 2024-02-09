package programming;
//Given an array of strings, write a program to sort the array based on the following criteria:
//First, sort the strings based on their lengths in ascending order.
//If two strings have the same length, sort them in descending order based on the their last characters.

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparing((String s) -> s.length()).reversed())
                .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()));
    }
}