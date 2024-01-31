package programs;

public class SwapWithoutThirdVariable {
        public static int[] swapWithoutTemp(int a, int b) {
            a = a + b;
            b = a - b;
            a = a - b;
            return new int[]{a, b};
        }
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            System.out.println("Before swapping: a = " + a + ", b = " + b);
            int[] result = swapWithoutTemp(a, b);
            a = result[0];
            b = result[1];
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
}
