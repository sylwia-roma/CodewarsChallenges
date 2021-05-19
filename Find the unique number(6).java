package com.company;

import java.util.Arrays;

//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//        It’s guaranteed that array contains at least 3 numbers.
//
//        The tests contain some very huge arrays, so think about performance.

public class Main {

    public static void main(String[] args) {
        double[] a = new double[]{1, 1, 1, 2, 1, 1};
        System.out.println(findUniq(a));
    }

    public static double findUniq(double arr[]) {

        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];

//        double zmienna = 0;
//
//        for(int i =0; i< arr.length; i++)
//        {
//            int count = 0;
//            for(int j=0; j< arr.length; j++) {
//                if(arr[i]!=arr[j]){
//                    count++;
//
//                }
//            }
//            if(count>1){
//                zmienna=arr[i];
//            }
//        }
//
//        return zmienna;


    }
}
