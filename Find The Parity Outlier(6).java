package com.company;

public class Main {

    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        System.out.println(find(exampleTest1));
    }

    static int find(int[] integers) {
        int parzyste = 0;
        int nieparzyste = 0;
        int[] arrayZParzystymi = new int[1];
        int[] arrayZNieParzystymi = new int[1];
        int innaLiczba = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                parzyste++;
                arrayZParzystymi[0] = integers[i];
            } else {
                nieparzyste++;
                arrayZNieParzystymi[0] = integers[i];
            }
        }

        if (parzyste == 1) {
            innaLiczba = arrayZParzystymi[0];
        } else if (nieparzyste == 1) {
            innaLiczba = arrayZNieParzystymi[0];
        }

        return innaLiczba;
    }
}
