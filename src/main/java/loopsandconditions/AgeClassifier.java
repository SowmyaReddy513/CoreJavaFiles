package loopsandconditions;

public class AgeClassifier {
    public static void main(String[] args) {
        // Test the function with different ages
        classifyAge(8);  // Kid
        classifyAge(15); // Teen
        classifyAge(25); // Adult
    }

    // Function to classify a person's age into kid, teen, or adult
    private static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}

