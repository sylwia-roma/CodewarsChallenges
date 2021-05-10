//There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.
//
//        You are given money in nominal value of n with 1<=n<=1500.
//
//        Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.
//
//        Good Luck!!!

        package com.company;


import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        System.out.println(solve(1400));
    }

    public static int solve(int n) {

        int[] banknoty = new int[]{500, 200, 100, 50, 20, 10};
        int wynik =0;

        for(int banknot: banknoty){
            wynik += n/banknot;
            System.out.println("Wynik " + wynik);
            int a = n %= banknot;
            System.out.println("n %= banknot = " + a);
        }

        return n == 0 ?  wynik : -1;


    }
}
