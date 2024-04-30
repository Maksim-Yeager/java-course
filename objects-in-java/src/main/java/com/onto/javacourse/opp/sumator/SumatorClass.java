import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A class that provides methods for summing different types of numbers.
 */
public class SumatorClass {

    /**
     * Sums two integers.
     *
     * @param firstNum  The first integer.
     * @param secondNum The second integer.
     * @return The sum of the two integers.
     */
    public int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    /**
     * Sums two floating point numbers.
     *
     * @param firstNum  The first floating point number.
     * @param secondNum The second floating point number.
     * @return The sum of the two floating point numbers.
     */
    public double sum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    /**
     * Sums two strings representing numbers.
     *
     * @param firstNum  The first number as a string.
     * @param secondNum The second number as a string.
     * @return The sum of the two numbers.
     */
    public double sum(String firstNum, String secondNum) {
        double num1 = Double.parseDouble(firstNum);
        double num2 = Double.parseDouble(secondNum);
        return num1 + num2;
    }

    /**
     * Sums two BigIntegers.
     *
     * @param firstNum  The first BigInteger.
     * @param secondNum The second BigInteger.
     * @return The sum of the two BigIntegers.
     */
    public BigInteger sum(BigInteger firstNum, BigInteger secondNum) {
        return firstNum.add(secondNum);
    }

    /**
     * Sums two BigDecimals.
     *
     * @param firstNum  The first BigDecimal.
     * @param secondNum The second BigDecimal.
     * @return The sum of the two BigDecimals.
     */
    public BigDecimal sum(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.add(secondNum);
    }
}
