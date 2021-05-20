package com.company;

//Complete the solution so that it returns true if the first argument(string)
// passed in ends with the 2nd argument (also a string).
//
//        Examples:
//
//        solution('abc', 'bc') // returns true
//        solution('abc', 'd') // returns false

public class Main {

    public static void main(String[] args) {
        System.out.println(solution("sumo", "omokok"));
    }

    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);


//        int endingLength = ending.length();
//        int wskaznik = 0;
//        boolean czyTakaSama = false;
//        if(str.length()<endingLength){
//            return false;
//        } else if(endingLength==0){
//            return true;
//        }
//
//        for(int i=str.length()-endingLength; i<str.length(); i++){
//            char c = str.charAt(i);
//            char b = ending.charAt(wskaznik);
//
//            if(c==b){
//                czyTakaSama = true;
//            } else {
//                czyTakaSama = false;
//                break;
//            }
//            wskaznik++;
//        }
//        return czyTakaSama;
    }
}
