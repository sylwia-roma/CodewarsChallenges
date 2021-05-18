package com.company;

//Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and
// the lowest element (the value, not the index!).
//        (The highest/lowest element is respectively only one element at each edge, even
//        if there are more than one with the same value!)
//
//        Example:
//
//        { 6, 2, 1, 8, 10 } => 16
//        { 1, 1, 11, 2, 3 } => 6
//
//        If array is empty, null or None, or if only 1 Element exists, return 0.
//        Note:In C++ instead null an empty vector is used. In C there is no null. ;-)
//
//
//        -- There's no null in Haskell, therefore Maybe [Int] is used. Nothing represents null.
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have created other katas. Have a look if you like coding and challenges.

public class Main {

    public static void main(String[] args) {
        int[] integers = new int[] { 6, 2, 1, 8, 10};
        System.out.println(sum(integers));
    }

    public static int sum(int[] numbers)
    {
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        int sum = 0;
        int returnSum = 0;
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;

        for(int i=0; i< numbers.length; i++) {
            if(numbers[i] > biggest)
                biggest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

            sum+=numbers[i];
        }

        returnSum=sum-biggest-smallest;



        return returnSum;


    }
}
