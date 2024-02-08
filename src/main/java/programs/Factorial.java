package programs;

public class Factorial {

    public int calculateFactorial(int n) {
        // Base case: Factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: Factorial of n is n multiplied by factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }
}