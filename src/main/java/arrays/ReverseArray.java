package arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(myArray);
        System.out.print("Original Array: ");
        printArray(myArray);
        System.out.print("Reversed Array: ");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}

