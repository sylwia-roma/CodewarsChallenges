package com.company;

//Write a function that takes an integer as input, and returns the number of bits that are
// equal to one in the binary representation of that number. You can guarantee that input is non-negative.
//
//        Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(5));
    }

    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n);

        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
