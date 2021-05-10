package com.company;

//You probably know the "like" system from Facebook and other pages.
// People can "like" blog posts, pictures or other items. We want to create
// the text that should be displayed next to such an item.


//
//        Implement a function likes :: [String] -> String, which must take in input array,
//        containing the names of people who like an item. It must return the display
//        text as shown in the examples:
//
//        likes {} // must be "no one likes this"
//        likes {"Peter"} // must be "Peter likes this"
//        likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
//        likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
//        likes {"Alex", "Jacob", "Mark", "Max"}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] likes = {"Alex", "Jacob", "Mark", "Max", "Jacob", "Mark", "Max"};
        System.out.println(whoLikesIt(likes));
    }

    public static String whoLikesIt(String[] names) {
        String who = "";
        int length = names.length-2;


        if(names.length<1){
            who = "no one likes this";
        } if(names.length==1){
            who = names[0] + "likes this";
        } if(names.length==2){
            who = names[0] + " and " + names[1] + "like this";
        } if(names.length==3){
            who = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } if(names.length>=4) {
            who = names[0] + ", " + names[1] + " and " + length + " others like this";
        }

        return who;
    }
}
