package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("de ef rge"));
    }

    public static String reverseWords(final String original)
    {
        String words[]=original.split("\\s");
        String reverse = "";


        for(int i=0; i< words.length; i++){
            String word = words[i];
            String reversedWord = "";
            for(int j =word.length()-1; j>=0; j--){
                reversedWord = reversedWord + word.charAt(j);
            }

            reverse = reverse + reversedWord + " ";

        }
        return reverse;
    }
}
