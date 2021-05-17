//The goal of this exercise is to convert a string to a new string where each character in the
// new string is "(" if that character appears only once in the original string, or ")"
// if that character appears more than once in the original string. Ignore capitalization
// when determining if a character is a duplicate.
//
//        Examples
//
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("
//        Notes
//
//        Assertion messages may be unclear about what they display in some languages.
//        If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(encode("Success"));
        //)())())
    }

    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
            //System.out.println(word.lastIndexOf(c) + " == " + word.indexOf(c));
        }
        return result;
    }
}
