import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    @Test
    public void testCalculateGcd() {
        assertEquals(3, GCD.calculateGcd(9, 12));
        assertEquals(5, GCD.calculateGcd(30, 25));
        assertEquals(1, GCD.calculateGcd(17, 23));
        Exception exceptionBothZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateGcd(0, 0);
        });
        String expectedMessage = "Invalid numbers, they cannot be 0.";
        String actualMessageBothZero = exceptionBothZero.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));

    }

    @Test
    public void testCalculateLcm() {
        assertEquals(36, GCD.calculateLcm(12, 18));
        assertEquals(60, GCD.calculateLcm(20, 15));
        assertEquals(35, GCD.calculateLcm(7, 5));
        Exception exceptionBothZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateLcm(0, 0);
        });
        String expectedMessage = "Invalid numbers, they cannot be 0.";
        String actualMessageBothZero = exceptionBothZero.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));

    }

}
