package com.company;

//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//Examples input/output:

public class Main {

    public static void main(String[] args) {
        System.out.println(getXO("xoXoxoxo"));


    }

    public static boolean getXO (String str) {

        int count = 0;
        int count2 = 0;


        for (int j = 0; j < str.length(); j++) {
            if (str.toLowerCase().charAt(j)=='o') {
                count++;
            }
            if(str.toLowerCase().charAt(j)=='x'){
                count2++;
            }
        }

        return count==count2;




    }
//

    }
