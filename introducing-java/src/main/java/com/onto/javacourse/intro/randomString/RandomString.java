/**
 * The RandomStringGenerator class generates random strings of a specified length.
 */
public class RandomString {

    /**
     * Generates a random string of the specified length using characters from ALLOWED_CHARACTERS.
     *
     * @param length The length of the random string to generate.
     * @return A random string of the specified length.
     */
    public static String randomString(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Lenght can not be or less than 0");
        }
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt((int) (Math.random() * characters.length())));
        }
        return sb.toString();
    }
}
