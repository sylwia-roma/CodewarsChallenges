package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(squareDigits(434));
    }

    public static int squareDigits(int n) {
        String result = "";
        while (n > 0) {

            int lastDigit = n % 10;
            result = lastDigit*lastDigit+result;
            n = n/10;
        }

        return Integer.parseInt(result);

    }
}
