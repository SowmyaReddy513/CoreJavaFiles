package loopsandconditions;
public class Pattern {

    public static void main(String[] args) {
        // Loop through each row
        for (int i = 1; i <= 5; i++) {
            // Print '+' characters
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("+");
            }
            // Print '-' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("-");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

