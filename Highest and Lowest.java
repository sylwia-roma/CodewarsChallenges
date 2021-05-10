package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        String hig = highAndLow("1 2 3 4 5");
        System.out.println(hig);

    }

    public static String highAndLow(String numbers) {

        String[] testArray = numbers.split(" ");



        int max = Integer.MIN_VALUE, maxIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= testArray.length-1; i++) {
            if (Integer.parseInt(testArray[i]) > max) {
                max = Integer.parseInt(testArray[i]);
                maxIndex = i;
            }

        }



        for (int i = 0; i <= testArray.length-1; i++) {
            if (Integer.parseInt(testArray[i]) < min) {
                min = Integer.parseInt(testArray[i]);
                maxIndex = i;
            }

        }
        String minS = Integer.toString(min);
        String maxS = Integer.toString(max);
        String maxMin = maxS + " " +   minS;

        return maxMin;
    }}
