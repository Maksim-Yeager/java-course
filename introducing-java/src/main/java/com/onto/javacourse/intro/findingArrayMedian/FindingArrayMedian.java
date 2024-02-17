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

        int index = 0;
        int currentLeftSum = 0;
        int currentRightSum = 0;
        int leftSum = 0;
        int rightSum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j != i) {
                    currentLeftSum += array[j];
                }
            }
            for (int j = array.length - 1; j > i; j--) {
                if (j != i) {
                    currentRightSum += array[j];
                }
            }
            if (currentRightSum > currentLeftSum) {
                if (currentRightSum - currentLeftSum < rightSum - leftSum) {
                    index = i;
                    rightSum = currentRightSum;
                    leftSum = currentLeftSum;
                    currentRightSum = 0;
                    currentLeftSum = 0;
                }
            } else {
                if (currentLeftSum - currentRightSum < rightSum - leftSum) {
                    index = i;
                    rightSum = currentRightSum;
                    leftSum = currentLeftSum;
                    currentRightSum = 0;
                    currentLeftSum = 0;
                }
            }
        }
        return index + 1;
    }
}
