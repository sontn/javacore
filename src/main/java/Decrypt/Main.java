package Decrypt;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.spec.KeySpec;
import java.util.Base64;


public class Main {
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String KEY_HASH_ALG = "PBKDF2WithHmacSHA1";
    public static final int SALT_LENGTH = 20;
    private static final int ITERATION_COUNT = 2000; // if changed, test-data should be changed too
    private static final int SECRET_KEY_LENGTH_IN_BITS = 128;
    private static String appSecretKey;


    public static String decrypt(String encryptedBase64, String appSecretKey) throws Exception {

        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedBase64);

        // --- tách salt, iv, ciphertext ---
        byte[] salt = new byte[SALT_LENGTH];
        byte[] iv = new byte[16];

        System.arraycopy(encryptedBytes, 0, salt, 0, SALT_LENGTH);
        System.arraycopy(encryptedBytes, SALT_LENGTH, iv, 0, 16);

        byte[] ciphertext = new byte[encryptedBytes.length - SALT_LENGTH - 16];
        System.arraycopy(encryptedBytes, SALT_LENGTH + 16, ciphertext, 0, ciphertext.length);

        // --- tạo secret key ---
        SecretKeyFactory factory = SecretKeyFactory.getInstance(KEY_HASH_ALG);
        KeySpec spec = new PBEKeySpec(appSecretKey.toCharArray(), salt, ITERATION_COUNT, SECRET_KEY_LENGTH_IN_BITS);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

        // --- giải mã ---
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv));

        byte[] decrypted = cipher.doFinal(ciphertext);
        return new String(decrypted, "UTF-8");
    }


    public static void main(String[] args) throws Exception {
        String encryptedFromDb = ""; // ciphertext trong DB
        String secret = "";
        System.out.println(decrypt(encryptedFromDb, secret));

    }
}
