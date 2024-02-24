/**
 * A utility class for reversing array
 */
public class ArrayReverse {

    /**
     * Reverses the elements of the given array.
     *
     * @param array the array to be reversed
     * @return the reversed array
     */
    public static int[] arrayReverse(int[] array) {
        if (array == null || array.length == 0)
        {
            throw new IllegalArgumentException("The array can not be empty!!!");
        }
        int start = 0;
        int end = array.length - 1;
        int[] reversedArray = new int[array.length];
        while (start <= end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }
        return reversedArray;
    }
}
