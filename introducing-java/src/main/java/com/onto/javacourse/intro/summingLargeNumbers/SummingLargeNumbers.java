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
    public static String sumNumbers(String fNum, String sNum) {
        if (fNum == null || sNum == null || fNum.isEmpty() || sNum.isEmpty()) {
            throw new IllegalArgumentException("The array can not be empty or null!!!");
        }
        if (!isNumeric(fNum) || !isNumeric(sNum)) {
            throw new IllegalArgumentException("Input strings must contain only numeric characters");
        }

        if (fNum.length() < sNum.length()) {
            String temp = sNum;
            sNum = fNum;
            fNum = temp;
        }
        String sum = "";
        int carry = 0;
        int sumN = 0;
        for (int i = 0; i < sNum.length(); i++) {
            int fNumber = (int) (fNum.charAt(fNum.length() - 1 - i)) - 48;
            int sNumber = (int) (sNum.charAt(sNum.length() - 1 - i)) - 48;
            sumN = fNumber + sNumber + carry;
            sum += (sumN % 10);
            carry = sumN / 10;
        }
        for (int i = sNum.length(); i < fNum.length(); i++) {
            int fNumber = (int) (fNum.charAt(fNum.length() - 1 - i)) - 48;
            sumN = fNumber + carry;
            sum += (sumN % 10);
            carry = sumN / 10;
        }
        if (carry > 0) {
            sum += (carry);
        }
        return stringReverse(sum);
    }

    /**
     * Reverses the characters in a string.
     *
     * @param str The string to be reversed.
     * @return The reversed string.
     * @throws IllegalArgumentException If the input string is null or empty.
     */
    public static String stringReverse(String srt) {
        if (srt == null || srt.length() == 0) {
            throw new IllegalArgumentException("The array can not be empty or null!!!");
        }
        int start = 0;
        char[] chars = srt.toCharArray();
        while (start <= srt.length() - 1 - start) {
            char temp = chars[start];
            chars[start] = chars[chars.length - 1 - start];
            chars[chars.length - 1 - start] = temp;
            start++;
        }
        srt = "";
        for (int i = 0; i < chars.length; i++) {
            srt += chars[i];
        }
        return srt;
    }

    /**
     * Checks if a string contains only numeric characters.
     *
     * @param str The string to be checked.
     * @return {@code true} if the string contains only numeric characters, {@code false} otherwise.
     */
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}
