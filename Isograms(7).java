package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {
        int count;

        char string[] = str.toLowerCase(Locale.ROOT).toCharArray();

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0') {
                return false;
            }

        }
        return true;
    }

}
