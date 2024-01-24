package strings;

import org.junit.Test;
import static org.junit.Assert.*;
import strings.Rotation;
public class RotationTest {

    @Test
    public void testRotateStrings() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        // Ensure that the method correctly identifies rotated strings
        assertTrue(Rotation.areRotatedStrings(str1, str2));
    }

    @Test
    public void testNotRotatedStrings() {
        String str1 = "Hello";
        String str2 = "World";

        // Ensure that the method correctly identifies non-rotated strings
        assertFalse(Rotation.areRotatedStrings(str1, str2));
    }

    @Test
    public void testRotatedStringsWithDifferentLengths() {
        String str1 = "Java";
        String str2 = "avaJ2ee";

        // Ensure that the method handles rotated strings with different lengths
        assertFalse(Rotation.areRotatedStrings(str1, str2));
    }

    @Test
    public void testRotatedStringsNullString() {
        String str1 = null;
        String str2 = "StrutsHibernateJavaJ2ee";

        // Ensure that the method handles null strings gracefully
        assertFalse(Rotation.areRotatedStrings(str1, str2));
    }

    @Test
    public void testRotatedStringsEmptyString() {
        String str1 = "";
        String str2 = "StrutsHibernateJavaJ2ee";

        // Ensure that the method handles empty strings gracefully
        assertFalse(Rotation.areRotatedStrings(str1, str2));
    }
}
