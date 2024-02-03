import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    @Test
    public void testGCD() {
        assertEquals(3, GCD.GCD(9, 12));
        assertEquals(5, GCD.GCD(30, 25));
        assertEquals(1, GCD.GCD(17, 23));
    }

    @Test
    public void testLCM() {
        assertEquals(36, GCD.LCM(12, 18));
        assertEquals(60, GCD.LCM(20, 15));
        assertEquals(35, GCD.LCM(7, 5));
    }

}
