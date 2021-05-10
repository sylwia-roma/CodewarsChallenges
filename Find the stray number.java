//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)

package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {1, 7, 1, 1};
        System.out.println(stray(num));
    }

    static int stray(int[] numbers) {
        //ROZWIĄZANIE NR 1
//        int diffrentNumber = 0;
//        for (int i = 0; i < numbers.length - 1; i++) {
//
//                if (numbers[i] != numbers[i+1]) {
//                    diffrentNumber = numbers[i+1];
//                    break;
//                }
//
//
//
//        }
//        return diffrentNumber;

        //ROZWIĄZANIE NR 2

        Arrays.sort(numbers);

//        for(int z: numbers) {
//            System.out.println(z);
//        }

        int differentNumber = 0;
        if(numbers[0]==numbers[1]){
            differentNumber = numbers[numbers.length-1];
        } else {
            differentNumber = numbers[0];
        }

        return differentNumber;
    }
}
