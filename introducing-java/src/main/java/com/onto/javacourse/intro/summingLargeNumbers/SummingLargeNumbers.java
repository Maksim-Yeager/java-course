import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to sum two large numbers represented as strings.
 */
public class SummingLargeNumbers {

    /**
     * Sums two large numbers represented as strings.
     *
     * @param fNum the first large number
     * @param sNum the second large number
     * @return a list representing the sum of the two large numbers
     */
    public static List<Integer> sumNumbers(String fNum, String sNum) {
        if (fNum.length() < sNum.length()) {
            String temp = sNum;
            sNum = fNum;
            fNum = temp;
        }

        List<Integer> sum = new ArrayList<>();
        int carry = 0;
        int sumN = 0;
        for (int i = 0; i < sNum.length(); i++) {
            int fNumber = (int) (fNum.charAt(fNum.length() - 1 - i)) - 48;
            int sNumber = (int) (sNum.charAt(sNum.length() - 1 - i)) - 48;
            sumN = fNumber + sNumber + carry;
            sum.add(sumN % 10);
            carry = sumN / 10;
        }
        for (int i = sNum.length(); i < fNum.length(); i++) {
            int fNumber = (int) (fNum.charAt(fNum.length() - 1 - i)) - 48;
            sumN = fNumber + carry;
            sum.add(sumN % 10);
            carry = sumN / 10;
        }
        if (carry > 0) {
            sum.add(carry);
        }
        return sum.reversed();
    }
}
