package SumOfArraySingles;

//In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice.
// Your task will be to return the sum of the numbers that occur only once.
//
//        For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.
//        Every other number occurs twice.
//
//        More examples in the test cases.
//
//        Good luck!

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfArraySingles {
    public static void main(String[] args) {

        System.out.println(repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));
        System.out.println(repeats(new int []{9, 10, 19, 13, 19, 13}));
        System.out.println(repeats(new int []{4,5,7,5,4,8}));

    }

    public static int repeats(int [] arr){
        Arrays.sort(arr);
        int noDup = 0;
        int sum = 0;
        int numOfNoDup = 0;

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length-1; i+=2){
            if(arr[i]!=arr[i+1]){
                noDup=arr[i];
                sum+=noDup;
                numOfNoDup++;
                i=i-1;
            }

        }
        if(numOfNoDup==1){
            sum+=arr[arr.length-1];
        }
        return sum;
        }
}

