package DetectPangram;

//A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
// the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z
// at least once (case is irrelevant).
//
//        Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
//        Ignore numbers and punctuation.

import java.util.Locale;

public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence){
        sentence = sentence.toLowerCase().replaceAll("\\s","");
        int count=0;
        int tmp=0;


        for(char letter='a'; letter<='z'; letter++){
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)==letter){
                    count++;
                }
            }
            if(count>=1){
                count=0;
                tmp++;
            }
        }

        if(tmp==26){
            return true;
        } else{
            return false;
        }
    }
}
