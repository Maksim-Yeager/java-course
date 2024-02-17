import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingArrayMedianTest {
    @Test
    void testFindMedianPosition() {
        int[] array = {4, 5, 99, -1, 5, 6};
        assertEquals(3, FindingArrayMedian.findMedianPosition(array));
    }
}