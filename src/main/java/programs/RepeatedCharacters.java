package programs;

import java.util.HashMap;
import java.util.Map;
public class RepeatedCharacters {
    public static void printRepeatedCharacters(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }
        // Using a map to store the count of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Update the count in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        // Print repeated characters
        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
    public static void main(String[] args) {
        String testString = "programming";
        printRepeatedCharacters(testString);
    }
}

