import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SummingLargeNumbersTest {

    @Test
    public void sumNumberTest() {
        String fNum = "3734547554351634";
        String sNum = "90327251413";
        List<Integer> expected = List.of(3, 7, 3, 4, 6, 3, 7, 8, 8, 1, 6, 0, 3, 0, 4, 7);
        assertEquals(expected, SummingLargeNumbers.sumNumbers(fNum, sNum));
    }
}