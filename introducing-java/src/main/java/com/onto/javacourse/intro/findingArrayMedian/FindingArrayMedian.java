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
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum >= totalSum / 2) {
                return i + 1;
            }
        }
        return -1;
    }
}
