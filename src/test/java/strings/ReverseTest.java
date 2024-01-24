package strings;

import org.junit.Test;
import strings.Reverse;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void testReverseSentence() {
        String inputSentence = "Java J2EE Reverse Me";
        String expectedOutput = "avaJ EE2J esreveR eM";

        String result = Reverse.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithEmptyString() {
        String inputSentence = "";
        String expectedOutput = "";

        String result = Reverse.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithSingleWord() {
        String inputSentence = "Hello";
        String expectedOutput = "olleH";

        String result = Reverse.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    // Add more test cases as needed

}
