package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
    }

    public static int duplicateCount(String text) {
        int wordCount = 0;
        int duplicateCount = 0;
        text = text.toLowerCase(Locale.ROOT);

        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 1) {
                duplicateCount++;
            }

            if (wordCount > 0) {

                //System.out.println(letter + "=" + wordCount);
                wordCount = 0;
            }
        }

        return duplicateCount;

    }
}
