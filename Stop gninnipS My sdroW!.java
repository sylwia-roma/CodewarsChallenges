package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        spinWords("Hey fellow warriors");
    }

    public static String spinWords(String sentence) {
        String[] testArray = sentence.split(" ");

        //System.out.println(Arrays.toString(testArray));

        StringBuilder input1 = new StringBuilder();
        for(int i=0; i<testArray.length; i++){

            if(testArray[i].length()>=5){
                //My solution
//                input1.append(testArray[i]);
//                input1.reverse();
//                //System.out.println(input1);
//                String reverseString = input1.toString();
//                testArray[i]=reverseString;


                //From Codewars
                testArray[i] = new StringBuilder(testArray[i]).reverse().toString();
            }
        }

        String S = String.join(" ", testArray);
        System.out.println(S);

        return S;
    }
}
