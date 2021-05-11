package com.company;

//This Kata is intended as a small challenge for my students
//
//        All Star Code Challenge #22
//
//        Create a function that takes an integer argument of seconds and converts the value into a string describing how many hours and minutes comprise that many seconds.
//
//        Any remaining seconds left over are ignored.
//
//        Note:
//        The string output needs to be in the specific form - "X hour(s) and X minute(s)"
//
//        For example:
//
//        3600 --> "1 hour(s) and 0 minute(s)"
//        3601 --> "1 hour(s) and 0 minute(s)"
//        3500 --> "0 hour(s) and 58 minute(s)"
//        323500 --> "89 hour(s) and 51 minute(s)"


public class Main {

    public static void main(String[] args) {
        System.out.println(toTime(323500));
        //System.out.println(toTime(3800));
    }

    public static String toTime(int seconds){
        int hour = 0;
        int minute= 0;

        if(seconds>=3600){
            hour = (int) Math.floor(seconds/3600);
            minute = (int) Math.floor((seconds-(hour*3600))/60);
        } else if(seconds>=60) {
            minute= (int) Math.floor(seconds/60);
        }

        return hour + " hour(s) and " + minute + " minute(s)";


        //Second solutions
        //return String.format("%d hour(s) and %d minute(s)", seconds / 3600, seconds % 3600 / 60);

    }
}
