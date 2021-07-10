package DecodeTheMorseCode;


import java.util.Arrays;
import java.util.Locale;

public class DecodeTheMorseCode {

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(decode("... --- ..."));
    }

    public static String decode(String morseCode) {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };
        // Morse code by indexing
        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };



        String[] arrayWord = morseCode.split("   ");

        //System.out.println(Arrays.toString(arrayWord));

        String c;
        String word = "";
        String[] wordArray = new String[arrayWord.length];

        for(int k=0; k< arrayWord.length; k++) {
            String[] array = arrayWord[k].split(" ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < code.length; j++) {
                    if (array[i].compareTo(code[j]) == 0) {
                        c = ((char) (j + 'a') + "").toUpperCase();
                        word += c;
//                        System.out.println(c);
//                        System.out.println("Word " + word);
                        break;
                    }

                }

                wordArray[k]=word;

            }
            word="";

            //System.out.println(Arrays.toString(wordArray));
        }

        String result = String.join(" ", wordArray);
        return result;


//        String result = "";
//        for(String word : morseCode.trim().split("   ")) {
//            for(String letter : word.split("\\s+")) {
//                result += MorseCode.get(letter);
//            }
//            result += ' ';
//        }
//        return result.trim();
    }
}
