package programs;

public class SwapWithoutThirdVariable {

    public int[] swapIntegers(int a, int b) {
        // Perform swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Return the swapped values
        return new int[]{a, b};
    }
}
