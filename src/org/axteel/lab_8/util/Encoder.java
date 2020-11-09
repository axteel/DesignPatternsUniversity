package org.axteel.lab_8.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encoder {
    private static Encoder instance;
    private MessageDigest messageDigest;

    private Encoder() {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static Encoder getInstance() {
        if (instance == null) {
            instance = new Encoder();
        }
        return instance;
    }

    public String encode(String plainText) {
        byte[] plainBytes = plainText.getBytes();
        return messageDigest.digest(plainBytes).toString();
    }
}
