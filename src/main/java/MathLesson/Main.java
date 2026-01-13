package MathLesson;

import java.security.SecureRandom;

public class Main {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int POOL_LEN = ALPHA_NUMERIC_STRING.length();
    private static final SecureRandom SECURE_RANDOM = createSecureRandom();

    private static SecureRandom createSecureRandom() {
        SecureRandom sr = new SecureRandom();
        byte[] seed = sr.generateSeed(20);
        sr.setSeed(seed);
        return sr;
    }

    public static void main(String[] args) {
        int count = 8;
        StringBuilder builder = new StringBuilder();
        while (count-- !=0) {
            int index = SECURE_RANDOM.nextInt(POOL_LEN);
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        System.out.println(builder.toString());
    }
}
