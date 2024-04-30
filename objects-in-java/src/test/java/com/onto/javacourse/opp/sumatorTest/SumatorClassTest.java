import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumatorClassTest {
    @Test
    public void testSumIntegers() {
        SumatorClass sumator = new SumatorClass();
        assertEquals(5, sumator.sum(2, 3));
    }

    @Test
    public void testSumFloats() {
        SumatorClass sumator = new SumatorClass();
        assertEquals(-10.5, sumator.sum(-5.25f, -5.25f), 0.001);
    }

    @Test
    public void testSumStrings() {
        SumatorClass sumator = new SumatorClass();
        assertEquals(5, sumator.sum("2", "3"));
    }

    @Test
    public void testSumBigIntegers() {
        SumatorClass sumator = new SumatorClass();
        assertEquals("-10", sumator.sum(new BigInteger("-5"), new BigInteger("-5")).toString());
    }

    @Test
    public void testSumBigDecimals() {
        SumatorClass sumator = new SumatorClass();
        assertEquals("5.5", sumator.sum(new BigDecimal("2.5"), new BigDecimal("3.0")).toString());
    }
}
