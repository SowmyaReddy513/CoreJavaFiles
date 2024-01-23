package arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] myArray = {0, 2, 0, 12, 4, 0, 5, 0};
        moveZeros(myArray);
        // Print the modified array
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeros(int[] nums) {
        // Initialize an index to keep track of the position where non-zero elements should be placed
        int nonZeroIndex = 0;
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the nonZeroIndex and increment nonZeroIndex
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                // If the nonZeroIndex is different from the current index, set the current index to zero
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}


