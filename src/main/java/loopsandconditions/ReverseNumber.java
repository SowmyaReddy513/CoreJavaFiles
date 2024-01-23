package loopsandconditions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Reverse the digits of the number
        int revNum = reverseDigits(num);

        // Display the result
        System.out.println("The reversed number is: " + revNum);

        // Close the Scanner
        scanner.close();
    }

    // Function to reverse the digits of a number using loops and conditions
    private static int reverseDigits(int number) {
        int revNum = 0;

        while (number != 0) {
            // Extract the last digit of the number
            int digit = number % 10;

            // Build the reversed number by multiplying the current reversed number by 10 and adding the digit
            revNum = revNum * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        return revNum;
    }
}

