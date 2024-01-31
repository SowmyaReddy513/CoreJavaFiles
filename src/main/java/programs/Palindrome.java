package programs;
//A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.
public class Palindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        int testNumber = 121;

        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}
