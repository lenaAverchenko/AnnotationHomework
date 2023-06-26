package org.reflection.stringcollector;

import java.util.concurrent.ThreadLocalRandom;

public class NameUtil {

    private final static String LEXICON = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

    public static String getRandomString(int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(LEXICON.charAt(ThreadLocalRandom.current().nextInt(start, end)));
        }
        return builder.toString();
    }

    public static String getRandomName() {
        return getRandomString(0, 26);
    }

    public static String getRandomNumber() {
        return getRandomString(26, 36);
    }
}