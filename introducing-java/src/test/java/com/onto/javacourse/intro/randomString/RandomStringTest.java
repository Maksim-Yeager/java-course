import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomStringTest {

    @Test
    public void randomStringTest() {
        int length = 57;
        String randomString = RandomString.randomString(length);
        assertEquals(length, randomString.length());
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            RandomString.randomString(-7);
        });
        String expectedMessage = "Lenght can not be or less than 0";
        String actualMessageBothZero = emptyArrayException.getMessage();
        assertTrue(actualMessageBothZero.contains(expectedMessage));
    }
}
