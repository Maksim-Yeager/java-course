import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySortingTest {

    
    @Test
    public void quickSortTest() {
        int[] array = {5, 4, 3, 6, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        ArraySorting.sort(array);
        assertArrayEquals(sortedArray, array);
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            Object ArrayProcessing = null;
            ArraySorting.sort(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }
}
