package AnagramDetection;

//An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//        Note: anagrams are case insensitive
//
//        Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//        Examples
//
//        "foefet" is an anagram of "toffee"
//
//        "Buckethead" is an anagram of "DeathCubeK"

import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("Twoo", "Woot"));
    }

    public static boolean isAnagram(String test, String original) {
//        char charArray[] = test.toLowerCase().toCharArray();
//        char charArray2[] = original.toLowerCase().toCharArray();
//        boolean flag = false;
//        int length;
//
//        if(charArray.length>charArray2.length){
//            length=charArray.length;
//        } else{
//            length=charArray2.length;
//        }
//
//        if( test == null || original == null || test.length() != original.length())
//            return false;
//
//        Arrays.sort(charArray);
//        Arrays.sort(charArray2);
//
//
//        for(int i=0; i<length-1; i++){
//            if(charArray[i]==charArray2[i] && charArray.length == charArray2.length){
//                flag=true;
//            } else{
//                flag=false;
//            }
//        }
//
//        return flag;

        if (test == null || original == null || test.length() != original.length())
            return false;

        char charArray1[] = test.toLowerCase().toCharArray();
        char charArray2[] = original.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

}
