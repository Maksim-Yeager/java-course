import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseTest {
    @Test
    public void arrayReverseTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = {7, 6, 5, 4, 3, 2, 1};
        int[] reversedArray = ArrayReverse.arrayReverse(array);
        assertArrayEquals(expectedArray, reversedArray);
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            ArrayReverse.arrayReverse(new int[]{});
        });
        String expectedMessage = "The array can not be empty!!!";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }
}
