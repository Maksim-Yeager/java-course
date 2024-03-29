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
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array can not be empty or null!!!");
        }
        int start = 0;
        int[] reversedArray = new int[array.length];
        while (start <= array.length - 1 - start) {
            reversedArray[start] = array[array.length - 1 - start];
            reversedArray[array.length - 1 - start] = array[start];
            start++;
        }
        return reversedArray;
    }
}
