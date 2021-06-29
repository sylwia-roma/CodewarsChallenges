package SplitStrings;

//Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//        Examples:
//
//        StringSplit.solution("abc") // should return {"ab", "c_"}
//        StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

import java.util.Arrays;

public class SplitStrings {

    public static void main(String[] args) {

        System.out.println(solution("abcdef"));
    }

    public static String[] solution(String s) {
        float b = s.length();

        String [] a = new String[(int) Math.ceil(b/2)];
        int j = 0;

            for(int i=0; i< s.length(); i+=2) {
                a[j]=s.substring(i, Math.min(s.length(), i + 2));
                if(a[j].length()<2){
                    a[j]=a[j] + "_";
                }
                j++;
            }

        return a;

//        s = (s.length() % 2 == 0)?s:s+"_";
//        return s.split("(?<=\\G.{2})");
    }
}
