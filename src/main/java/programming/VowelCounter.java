package programming;

import java.util.Arrays;
//Given an array of strings, write a program to print the strings that contains a vowels. Print string and number of Vowels.
public class VowelCounter {
        public static void printVowelStrings(String[] strings) {
            Arrays.stream(strings)
                    .filter(s -> s.matches(".*[aeiouAEIOU].*")) // Filter strings containing vowels
                    .forEach(s -> {
                        long vowelCount = s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count(); // Count vowels
                        System.out.println(s + " - Number of vowels: " + vowelCount);
                    });
        }
}
