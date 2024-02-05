/**
 * The GCD (Greatest Common Divisor) class provides calculation methods
 * greatest common divisor and least common multiple of two integers.
 * These methods follow a mathematical algorithm to efficiently find the GCD
 * and then use it to determine the LCM.
 *
 * @author Maksim Simeonov
 */
public class GCD {
    /**
     * Calculates the greatest common divisor of two numbers.
     *
     * @param firstNumber  The first integer.
     * @param secondNumber The second integer.
     * @return The greatest common divisor of the two numbers.
     * @throws IllegalArgumentException If both numbers are 0 or only one of them is 0.
     */
    public static int calculateGcd(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            throw new IllegalArgumentException("Invalid numbers, they cannot be 0.");
        }
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return firstNumber;

    }

    /**
     * Calculates the least common multiple of two numbers.
     *
     * @param firstNumber  The first integer.
     * @param secondNumber The second integer.
     * @return The least common multiple of the two numbers.
     * @throws IllegalArgumentException If both numbers are 0 or only one of them is 0.
     */
    public static int calculateLcm(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            throw new IllegalArgumentException("Invalid numbers, they cannot be 0.");
        }
        return (firstNumber * secondNumber) / calculateGcd(firstNumber, secondNumber);

    }
}


