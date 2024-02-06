package programming;

import java.util.Arrays;
import java.util.Comparator;

//Given an array of Strings, write a program to Capitalize the first letter of the each String, and print the strings in alphabetical order.
public class CaptalizeFirstLetter {
        public static void main(String[] args) {
            String[] words = {"apple", "banana", "orange", "grape", "kiwi"};

            Arrays.stream(words)
                    .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
        }
}
