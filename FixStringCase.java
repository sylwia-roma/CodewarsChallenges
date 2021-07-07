package FixStringCase;

import java.util.Locale;

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(solve("coDe"));
    }

    public static String solve(final String str) {

        int count1 = 0;
        int count2 = 0;
        String a = "";

        for(int i=0; i<str.length(); i++) {
            char s = str.charAt(i);
            for (char q='a'; q<='z'; q++){
                if(s==q){
                    count1++;
                }
            }
            for(char w='A'; w<='Z'; w++){
                if(s==w){
                    count2++;
                }
            }


        }

        System.out.println(count1);
        System.out.println(count2);

        if(count1>=count2){
            a=str.toLowerCase(Locale.ROOT);

        } else {
            a=str.toUpperCase(Locale.ROOT);
        }

        return a; //your code here


//        int lower = 0;
//        for (Character c:str.toCharArray()) {
//            if (Character.isLowerCase(c))
//                lower++;
//        }
//        return str.length() - lower > lower ? str.toUpperCase() : str.toLowerCase();
    }
}
