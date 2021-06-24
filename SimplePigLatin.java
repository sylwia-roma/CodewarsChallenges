package SimplePigLatin;

import java.util.Arrays;

public class SimplePigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        String[] splited = str.split(" ");

        String regepx = "[^\\s\\w]*";

        for(int i=0; i<splited.length; i++) {
            String substring = splited[i].substring(1, splited[i].length());
            String firstLetter = splited[i].substring(0,1);
            String newString = substring + firstLetter + "ay";

            //System.out.println(firstLetter);

            if(firstLetter.matches(regepx)) {
                newString = firstLetter;
            }


            splited[i]=newString;
        }

        //System.out.println(Arrays.toString(splited));
        String joinedString = String.join(" ", splited);

        return joinedString;


        //return str.replaceAll("(\\w)(\\w*)", "$2$1ay");


    }
}
