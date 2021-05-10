//The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)
//
//        Example:
//
//        Split the below string into other strings of size #3
//
//        'supercalifragilisticexpialidocious'
//
//        Will return a new string
//        'sup erc ali fra gil ist ice xpi ali doc iou s'
//        Assumptions:
//
//        String length is always greater than 0
//        String has no spaces
//        Size is always positive
//
        package com.company;



public class Main {

    public static void main(String[] args) {
        System.out.println(splitInParts("yguyguynjknhnih", 5));
    }

    public static String splitInParts(String s, int partLength) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=partLength; i<sb.length(); i+=partLength){
            sb.insert(i, " ");
        }
        return sb.toString();
    }
}
