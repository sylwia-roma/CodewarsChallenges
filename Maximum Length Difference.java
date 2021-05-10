//You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
//
//        Find max(abs(length(x) − length(y)))
//
//        If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//        Example:
//
//        a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//        a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//        mxdiflg(a1, a2) --> 13
//        Bash note:
//
//        input : 2 strings with substrings separated by ,
//        output: number as a string

package com.company;


public class Main {

    public static void main(String[] args) {
        String[] a = {"debhbhbhgvhgvghv hgwd", "wedew", "wefmnnnew", "frefregrr", "h", "eheuihfuieh"};
        String[] b = {};
        System.out.println(mxdiflg(a, b));
    }

    public static int mxdiflg(String[] a1, String[] a2) {

        if(a1.length==0||a2.length==0){
            return -1;
        }
        int dlugosc = 0;
        int maxDlugoscA1 = 0;
        int minDlugoscA1 = Integer.MAX_VALUE;

        int maxDlugoscA2 = 0;
        int minDlugoscA2 = Integer.MAX_VALUE;



        for(int i=0; i<a1.length; i++){
            dlugosc=a1[i].length();

            if(dlugosc>=maxDlugoscA1) {
                maxDlugoscA1=dlugosc;
            }

            if(dlugosc<=minDlugoscA1){
                minDlugoscA1=dlugosc;
            }

        }

//        System.out.println("Min dlugosc " + minDlugoscA1);
//        System.out.println("Max dlugosc " + maxDlugoscA1);

        for(int i=0; i<a2.length; i++){
            dlugosc=a2[i].length();

            if(dlugosc>=maxDlugoscA2) {
                maxDlugoscA2=dlugosc;
            }

            if(dlugosc<=minDlugoscA2){
                minDlugoscA2=dlugosc;
            }

        }
//        System.out.println("Min dlugosc2 " + minDlugoscA2);
//        System.out.println("Max dlugosc2 " + maxDlugoscA2);

        int min = 0;
        int max = 0;
        if(minDlugoscA1<minDlugoscA2){
            min=minDlugoscA1;
        } else {
            min=minDlugoscA2;
        }

        if(maxDlugoscA1>maxDlugoscA2){
            max=maxDlugoscA1;
        } else{
            max=maxDlugoscA2;
        }

        int roznica = max-min;

        return roznica;

//        if(a1.length==0||a2.length==0)
//            return -1;
//
//        int b1=0, b2=0;
//        int l1=Integer.MAX_VALUE, l2=Integer.MAX_VALUE;
//
//        for (String s : a1) {
//            b1 = Math.max(b1, s.length());
//            l1 = Math.min(l1, s.length());
//        }
//        for (String s : a2) {
//            b2 = Math.max(b2, s.length());
//            l2 = Math.min(l2, s.length());
//        }
//
//        return Math.max(Math.abs(b2-l1), Math.abs(b1-l2));

    }
}
