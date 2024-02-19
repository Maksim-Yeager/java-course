public class ArraySorting {
    /**
     * Sorts the given array using the QuickSort algorithm.
     *
     * @param array the array of integers to be sorted
     */
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Recursively sorts the subarray using the QuickSort algorithm.
     *
     * @param array the array to be sorted
     * @param low   the index of the first element in the subarray
     * @param high  the index of the last element in the subarray
     */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    /**
     * Partitions the array into two halves around a pivot element.
     *
     * @param array the array to be partitioned
     * @param low   the index of the first element in the subarray
     * @param high  the index of the last element in the subarray
     * @return the index of the pivot element after partitioning
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param array the array in which elements are to be swapped
     * @param i     the index of the first element
     * @param j     the index of the second element
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
