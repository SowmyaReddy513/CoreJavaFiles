package programs;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowerToUpperTest {

    @Test
    public void testConvertCase() {
        LowerToUpper lowerToUpper = new LowerToUpper();

        // Test case 1: Convert lowercase to uppercase
        String inputString1 = "helloworld";
        assertEquals("HELLOWORLD", lowerToUpper.convertCase(inputString1));

        // Test case 2: Convert uppercase to lowercase
        String inputString2 = "JAVAPROGRAMMING";
        assertEquals("javaprogramming", lowerToUpper.convertCase(inputString2));

        // Test case 3: Mixed case conversion
        String inputString3 = "AbCdEfG";
        assertEquals("aBcDeFg", lowerToUpper.convertCase(inputString3));

        // Test case 4: Empty string
        String inputString4 = "";
        assertEquals("", lowerToUpper.convertCase(inputString4));

        // Test case 5: String with non-alphabetic characters
        String inputString5 = "123!@#";
        assertEquals("123!@#", lowerToUpper.convertCase(inputString5));
    }
}
