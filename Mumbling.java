package Mumbling;

//This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(accum("HbideVbxncC"));
    }

    public static String accum(String s) {

        String newString = "";
        String newString2 = "";

        for(int i=0; i<s.length();i++){
            char a = s.toLowerCase().charAt(i);

            String q = "";

            for(int j=0; j<=i; j++) {
                q+=a;

            }
            String firstLetter = q.substring(0,1).toUpperCase();
            String remLetter = q.substring(1);
            q=firstLetter+remLetter;
            //System.out.println(q);
            newString+=q + "-";
        }

        newString2 = newString.substring(0, newString.length()-2);

        return newString2;


        //SECOND SOLUTION
//        String result = "";
//        for(int i = 0; i != s.length(); i++)
//        {
//            for(int j = 1; j != i+2; j++)
//                result = result + (j == 1 ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i));
//            result = result + (i != s.length()-1 ? '-' : "");
//        }
//        return result;
    }
}
