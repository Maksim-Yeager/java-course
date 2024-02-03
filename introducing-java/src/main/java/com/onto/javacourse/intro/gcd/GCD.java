public class GCD {

    /**
     * Method to find GCD
     */
    public static int GCD(int a, int b) {
        if (a != 0 || b != 0) {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        } else {
            throw new IllegalArgumentException("Invalid numbers");
        }
    }

    /**
     * Method to find LCM
     */
    public static int LCM(int a, int b) {
        if (a != 0 || b != 0) {
            return (a * b) / GCD(a, b);
        } else {
            throw new IllegalArgumentException("Invalid numbers");
        }

    }

}
