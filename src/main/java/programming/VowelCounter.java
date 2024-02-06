package programming;

import java.util.Arrays;
//Given an array of strings, write a program to print the strings that contains a vowels. Print string and number of Vowels.
public class VowelCounter {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "orange", "smsdsmjsk"};
        Arrays.stream(strings)
                .filter(str -> str.matches(".*[aeiouAEIOU].*"))
                .forEach(str -> {
                    int vowelCount = (int) str.chars()
                            .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                            .count();
                    System.out.println("String: " + str + ", Number of vowels: " + vowelCount);
                });
    }
}
