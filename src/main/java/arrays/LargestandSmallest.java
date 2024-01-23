package arrays;

public class LargestandSmallest {
        public static void main(String[] args) {
            int[] myArray = {3, 1, 7, 9, 4, 2};
            int[] result = findLargestAndSmallest(myArray);
            System.out.println("Largest Number: " + result[0]);
            System.out.println("Smallest Number: " + result[1]);
        }

        public static int[] findLargestAndSmallest(int[] arr) {
            if (arr == null || arr.length == 0) {
                return new int[]{0, 0};  // Return {0, 0} for both if the array is empty
            }

            //largest and smallest, with the first element of the array. This assumes that the array is not empty.
            int largest = arr[0];
            int smallest = arr[0];

            //comparing each element with the current values of largest and smallest.
            for (int num : arr) {
                if (num > largest) {
                    largest = num;
                } else if (num < smallest) {
                    smallest = num;
                }
            }
            return new int[]{largest, smallest};
        }

}
