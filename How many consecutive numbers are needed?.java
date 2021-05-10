package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{4, 2, 7, 8, 10}));
        System.out.println(consecutive(new int[]{}));
    }

    public static int consecutive(final int[] arr) {

        //I SPOSÓB
        //int [] sort = arr;
//        Arrays.sort(arr);
////        for(int z: arr){
////            System.out.print(z + " ");
////        }
//
//        int max = arr[arr.length-1];
//        int min = arr[0];
//        //System.out.println("Max = " + max);
//        //System.out.println("Min = " + min);
//
//        int roznica = max-min+1;
//        //System.out.println("Różnica " + roznica);
//
//        //int różnica = arr[arr.length]-arr[0];
//
//        int długośćTablicy = arr.length;
//        //System.out.println("Długość tablicy " + długośćTablicy);
//
//        int remainsNumbers = roznica-długośćTablicy;
//        //System.out.println("Brakujących znaków = " + remainsNumbers);
//        return remainsNumbers; // your code here


        //II SPOSÓB

        if (arr != null && arr.length > 0) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int roznica = max-min+1;
            int długośćTablicy = arr.length;
            int wynik = roznica-długośćTablicy;
            return wynik;
        } else {
            return 0;
        }







    }
}
