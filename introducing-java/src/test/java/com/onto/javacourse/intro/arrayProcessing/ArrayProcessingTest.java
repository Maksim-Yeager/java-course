import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayProcessingTest {

    @Test
    public void testGetMinElementIndex() {
        assertEquals(2, ArrayProcessing.getMinElementIndex(new int[]{5, 8, 3, 12, 7}));
        assertEquals(0, ArrayProcessing.getMinElementIndex(new int[]{1, 2, 3, 4, 5}));
        assertEquals(4, ArrayProcessing.getMinElementIndex(new int[]{10, 20, 30, 40, 5}));
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessing.getMinElementIndex(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }

    @Test
    public void testSum() {
        assertEquals(28, ArrayProcessing.sum(new int[]{5, 8, 3, 12}));
        assertEquals(15, ArrayProcessing.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(105, ArrayProcessing.sum(new int[]{10, 20, 30, 40, 5}));
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessing.sum(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }

    @Test
    void testPrint() {

        int[] array = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5 ";
        assertEquals(expected, ArrayProcessing.print(array));
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessing.print(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }

    @Test
    public void testFindLargestSumSubarray() {
        int[] array = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
        int[] expectedSubarray = {4, -1, 2, 1};
        int[] result = ArrayProcessing.findLargestSumSubarray(array);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedSubarray[i], result[i]);
        }
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessing.findLargestSumSubarray(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }
}


