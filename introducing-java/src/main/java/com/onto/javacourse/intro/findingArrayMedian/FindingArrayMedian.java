import java.util.Arrays;

/**
 * The ArrayProcessing class provides various methods for processing integer arrays.
 */
public class FindingArrayMedian {

    /**
     * Finds the position of the median in the array.
     *
     * @param array The input array of integers.
     * @return The position of the median when counting starts from 1.
     */
    public static int findMedianPosition(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int totalSum = Arrays.stream(array).sum();
        int leftSum = 0;
        int rightSum = 0;
        int minDiff = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum = totalSum - leftSum + array[i];
            int diff = Math.abs(leftSum - rightSum);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }
        return index + 1;
    }
}
