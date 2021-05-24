package com.company;

//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
// which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example:
//
//        persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//        // and 4 has only one digit
//
//        persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//        // 1*2*6 = 12, and finally 1*2 = 2
//
//        persistence(4) == 0 // because 4 is already a one-digit number

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int score=1;
        int finalScore=Integer.MAX_VALUE;

        while (finalScore>9) {
                while (n > 0) {
                    stack.push((int) (n % 10));
                    n = n / 10;
                }

                for (int i = 0; i < stack.size(); i++) {
                    score *= stack.get(i);
                }

                if (score > 9) {
                    stack.clear();
                    n = score;
                }

                finalScore=score;
                score=1;
            }

        return finalScore;
    }
}
