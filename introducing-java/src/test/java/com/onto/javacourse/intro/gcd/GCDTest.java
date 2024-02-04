import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    @Test
    public void testCalculateGcd() {
        assertEquals(3, GCD.calculateGcd(9, 12));
        assertEquals(5, GCD.calculateGcd(30, 25));
        assertEquals(1, GCD.calculateGcd(17, 23));
    }

    @Test
    public void testCalculateLcm() {
        assertEquals(36, GCD.calculateLcm(12, 18));
        assertEquals(60, GCD.calculateLcm(20, 15));
        assertEquals(35, GCD.calculateLcm(7, 5));
    }

    @Test
    void testCalculateGcdWithZero() {
        Exception exceptionBothZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateGcd(0, 0);
        });
        Exception exceptionFirstIsZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateGcd(0, 21);
        });
        Exception exceptionSecondIsZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateGcd(4, 0);
        });

        String expectedMessage = "Invalid numbers, they cannot be 0.";
        String actualMessageBothZero = exceptionBothZero.getMessage();
        String actualMessageFirstIsZero = exceptionFirstIsZero.getMessage();
        String actualMessageSecondIsZero = exceptionSecondIsZero.getMessage();

        assertTrue(actualMessageBothZero.contains(expectedMessage));
        assertTrue(actualMessageFirstIsZero.contains(expectedMessage));
        assertTrue(actualMessageSecondIsZero.contains(expectedMessage));
    }

    @Test
    void testCalculateLcmWithZero() {
        Exception exceptionBothZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateLcm(0, 0);
        });
        Exception exceptionFirstIsZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateLcm(0, 21);
        });
        Exception exceptionSecondIsZero = assertThrows(IllegalArgumentException.class, () -> {
            GCD.calculateLcm(4, 0);
        });

        String expectedMessage = "Invalid numbers, they cannot be 0.";
        String actualMessageBothZero = exceptionBothZero.getMessage();
        String actualMessageFirstIsZero = exceptionFirstIsZero.getMessage();
        String actualMessageSecondIsZero = exceptionSecondIsZero.getMessage();

        assertTrue(actualMessageBothZero.contains(expectedMessage));
        assertTrue(actualMessageFirstIsZero.contains(expectedMessage));
        assertTrue(actualMessageSecondIsZero.contains(expectedMessage));

    }

}
