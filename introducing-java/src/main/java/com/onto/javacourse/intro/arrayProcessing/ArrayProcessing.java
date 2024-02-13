import java.util.Arrays;
/**
 * This class provides various methods for processing arrays.
 */

public class ArrayProcessing {
    /**
     * Finds the index of the minimum element in the array.
     *
     * @param array The input array.
     * @return The index of the minimum element in the array.
     * @throws IllegalArgumentException if the input array is null or empty.
     */
    public static int getMinElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minIndex = 0;
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Calculates the sum of elements in the array.
     *
     * @param array The input array.
     * @return The sum of elements in the array.
     * @throws IllegalArgumentException if the input array is null.
     */
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int arraySum = 0;
        for(int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }

        return arraySum;
    }

    /**
     * Creates a string representation of the array.
     *
     * @param array The input array.
     * @return A string representation of the array.
     * @throws IllegalArgumentException if the input array is null.
     */
    public static String print(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++ ) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }

    /**
     * Finds the contiguous subarray with the largest sum.
     *
     * @param array The input array.
     * @return The contiguous subarray with the largest sum.
     * @throws IllegalArgumentException if the input array is null or empty.
     */
    public static int[] findLargestSumSubarray(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            int start = 0;
            int end = 0;
            int temp = 0;

            for (int i = 0; i < array.length; i++) {
                currentSum += array[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = temp;
                    end = i;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                    temp = i + 1;
                }
            }

            int[] subarray = Arrays.copyOfRange(array, start, end + 1);
            return subarray;
    }
}

