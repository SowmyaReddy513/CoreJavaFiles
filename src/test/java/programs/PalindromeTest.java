package programs;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {

        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(1221));
        assertTrue(Palindrome.isPalindrome(12321));
        assertFalse(Palindrome.isPalindrome(12345));
        assertTrue(Palindrome.isPalindrome(1));
        assertFalse(Palindrome.isPalindrome(123456));
    }
}
