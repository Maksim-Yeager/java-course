import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindingArrayMedianTest {
    @Test
    void testFindMedianPosition() {
        int[] array = {4, 5, 99, -1, 5, 6};
        assertEquals(3, FindingArrayMedian.findMedianPosition(array));
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            FindingArrayMedian.findMedianPosition(new int[]{});
        });
        String expectedMessage = "Array must not be null or empty";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));

    }
}