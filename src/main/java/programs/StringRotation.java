package programs;

public class StringRotation {

        public static boolean areRotations(String str1, String str2) {
            // Check if lengths of both strings are equal
            if (str1.length() != str2.length()) {
                return false;
            }
            // Concatenate str1 with itself
            String concatenatedStr = str1 + str1;
            // Check if str2 is a substring of the concatenated string
            return concatenatedStr.contains(str2);
        }
        public static void main(String[] args) {
            String str1 = "waterbottle";
            String str2 = "erbottlewat";
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println("Are strings rotations? " + areRotations(str1, str2));
        }

}
