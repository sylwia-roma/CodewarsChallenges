package HighestScoringWord;

import java.util.Arrays;

//Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.

public class HighestScoringWord {

    public static void main(String[] args) {
        System.out.println(high("aaa bbb ccce"));
    }

    public static String high(String s) {
        int letterPoints=0;
        int wordPoints = 0;


        String[] word = s.split(" ");
        int[] pointsArray = new int[word.length];

        //Counting the value of the word
        for(char i=0; i<word.length; i++){
            for(int j=0; j<word[i].length(); j++){
                for(char letter='a'; letter<='z'; letter++) {
                    letterPoints++;
                    if (word[i].charAt(j) == letter) {
                        wordPoints += letterPoints;
                    }
                    //System.out.println(word[i] + " " + wordPoints);
                    //System.out.println(Arrays.toString(word));
                    //System.out.println(letter + " " + letterPoints);
                    pointsArray[i]=wordPoints;
                }
                letterPoints=0;
            }
            wordPoints=0;
        }

        //Finding the index of the highest value of the array
        int max = pointsArray[0];
        int index = 0;

        for (int i = 0; i < pointsArray.length; i++)
        {
            if (max < pointsArray[i])
            {
                max = pointsArray[i];
                index = i;
            }
        }
        String theHighestValue = word[index];
        //System.out.println("The highest index " + index);
        //System.out.println(Arrays.toString(pointsArray));
        return theHighestValue;

    }
}
