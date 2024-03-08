import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SummingLargeNumbersTest {

    @Test
    public void sumNumberTest() {
        String fNum = "3734547554351634";
        String sNum = "90327251413";
        String expected = "3734637881603047";
        assertEquals(expected, SummingLargeNumbers.sumNumbers(fNum, sNum));
        Exception isNotNumericException = assertThrows(IllegalArgumentException.class, () -> {
            SummingLargeNumbers.sumNumbers("afasf", "234");
        });
        Exception nullException = assertThrows(IllegalArgumentException.class, () -> {
            SummingLargeNumbers.sumNumbers(null,null);
        });
        Exception emptyException = assertThrows(IllegalArgumentException.class, () -> {
            SummingLargeNumbers.sumNumbers("", "");
        });
        String expectedMessage = "The array can not be empty or null!!!";
        String expectedMessageIsNotNumeric = "Input strings must contain only numeric characters";
        String actualMessageEmpty = emptyException.getMessage();
        assertTrue(actualMessageEmpty.contains(expectedMessage));
        String actualMessageNull = nullException.getMessage();
        assertTrue(actualMessageNull.contains(expectedMessage));
        String actualMessageIsNotNumeric = isNotNumericException.getMessage();
        assertTrue(actualMessageIsNotNumeric.contains(expectedMessageIsNotNumeric));
    }

    @Test
    public void stringReverseTest(){
        String str = "1234567";
        String expectedStr = "7654321";
        String reversedStr = SummingLargeNumbers.stringReverse(str);
        assertEquals(expectedStr, reversedStr);
        Exception emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            SummingLargeNumbers.stringReverse("");
        });
        Exception nullArrayException = assertThrows(IllegalArgumentException.class, () -> {
            SummingLargeNumbers.stringReverse(null);
        });
        String expectedMessage = "The array can not be empty or null!!!";
        String actualMessageEmpty = emptyArrayException.getMessage();
        assertTrue(actualMessageEmpty.contains(expectedMessage));
        String actualMessageNull = nullArrayException.getMessage();
        assertTrue(actualMessageNull.contains(expectedMessage));
    }
}