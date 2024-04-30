import java.math.BigDecimal;
import java.math.BigInteger;

public class SumatorClass {
    public int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public double sum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double sum(String firstNum, String secondNum) {
        double num1 = Double.parseDouble(firstNum);
        double num2 = Double.parseDouble(secondNum);
        return num1 + num2;
    }

    public BigInteger sum(BigInteger firstNum, BigInteger secondNum) {
        return firstNum.add(secondNum);
    }

    public BigDecimal sum(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.add(secondNum);
    }
}
