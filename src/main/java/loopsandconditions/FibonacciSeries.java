package loopsandconditions;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        // Display the Fibonacci series up to the Nth term
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
        // Close the Scanner
        scanner.close();
    }
    // Function to print Fibonacci series up to the Nth term
    private static void printFibonacciSeries(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

