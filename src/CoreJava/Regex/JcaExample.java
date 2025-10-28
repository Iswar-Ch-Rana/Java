package CoreJava.Regex;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Base64;

public class JcaExample {
    public static void main(String[] args) throws Exception {
        // 1 Hashing
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest("JavaCryptography".getBytes());
        System.out.println("SHA-256 Hash: " + Base64.getEncoder().encodeToString(hash));

        // 2 Symmetric Encryption (AES)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey secretKey = keyGen.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal("Hello JCA".getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));

        // 3 Providers
        System.out.println("\nAvailable Providers:");
        for (Provider p : Security.getProviders()) {
            System.out.println(" - " + p.getName());
        }
    }
}
