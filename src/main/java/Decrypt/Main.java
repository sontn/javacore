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
        String encryptedFromDb = "rGLVV8ow+hxVr0P8B5zlwVdGS8syVIdILW/OlXKnYEBMtTQ1C778CCNHEbvukPKJwfOwIKp1sM0PAfYcLZZQ/lP5R3IKKppM/iWyvPnD5KiLPZMxKn1Cik66NieK/HfsanGAvm31C7E9vXYMK75VnGsSG8yF7mueGd0SfGjXv/EmlgEo5txRM6Lz30xEiMLpsbgdzFU1DzxIo4NRE+xbtgnarKFw3GlPEf566Xn5ZNbHt25S6sBRRwXAsEnB78jk86BLJqcgitkEWY+HicyoIT61A3gTf1VaVTNpev7E0kyY73bwfGZgV3guGUIH+nUO1SlKv2S8LClGJgssZIQGWpnXJH2gEzoINMWlnqBKvwTOWv/tevEBs5tsUW9J6+rYxU9hP77BBUtcGeAi5WXFC0JmJtaUqK3JR/l9mxdyttnzx4WSvARvBCUbYH6kpe9GYp2UXd8q43uE/FDFdMA0y+kVMpwo++zrcLE+JcyIQNzWEmUvjbVlDc67epZO5Z/213FWwkWG+3wIGji8FIuBImKAwlWLp7lOlufoYD+3IUBdTFGMr5qjHfNDIwfx40/NXRgYyU621oRCh9FXBHL78KyPbz3fXjLMLPODRUJygbcPyUcBvdNw6NAVGPK0qWIjfgM0vCtkD0AIxBa6ZfrfflJNa2n5uVENe9rnOwcTnXSQV9U+56rzgx4dKRgoL+kMAlSGxesV7qe1pHauHJDfVANEQNmynbuuECiV5ctJQVW0/wNNBJJuWMDlpwZNrgQKMaOMSvwRqFqz9JTre5XTU1Tfrp0MzunmTpAmrzHeasXehvCslapQcQ2O9PHJffGWjbSJ3cIfFDeR09Sd8StqbS7CD1h7ULC87R2hdm6mye4lKsSbU3v9gbfqIjscILjuoO+tPd4SmdeNFoDFhJlurwEEgAszmzVGkWt1PwGuJ+TXcbwkP7ywMJA8R2KqXT07lOaFhEQGioVcm1pBuNzv0av9d940FeRB1A1euAmkgbkw7yrmDmFg+6SHuDju4vWugE6LJmUjrPNzyAgqnPDqkfhtCuLhZZEDKwgCbZQQgUoi3ocYX1IwFz7Uh7KY2Y0/13analW5l0kNSpw06vgexKFYK/YBM7xZaT+vIc8pzjuz80QHcsWdCMdMfqhM1bBBT7pjfexdFDHIO3wsP+smuXvFJKfR8JAmKJqWB/jhuWGouF0GzuT8eaFejgXX97LU+miIFp3xOXj5/qE+ncNFtpOnMAOzAghw0jMlXZfTVr6YzOBCltPIWXgfTRTDx9k0b+0sBZ86fUEdPoDAiGN84ig8a+8C0F8qkGLkjxzt5fhToALb7yBaYAS7/eU7e+opX8cut/T5Pc+jUGZWMn26ZTI5zH8vmPziMNHKOfFWCM4VAfibpAUFO1/o//xRcWgcCapx+A=="; // ciphertext trong DB
        String secret = "";
        System.out.println(decrypt(encryptedFromDb, secret));

    }
}
