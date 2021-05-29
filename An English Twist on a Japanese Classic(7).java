//Background:
//
//        In Japan, a game called Shiritori is played. The rules are simple, a group of people take turns calling out a word whose beginning syllable is the same as the previous player's ending syllable. For example, the first person would say the word ねこ, and the second player must make a word that starts with こ, like　こむぎ. This repeats until a player can not think of a word fast enough or makes a word that ends in ん, because there are no words that begin with ん　in the Japanese language.
//
//        English Shiritori has the same principle, with the first and last letters of words. That being said the lose condition is saying a word that doesn't start with the previous word's last letter or not saying a word quick enough.
//
//        For example: apple -> eggs -> salmon -> nut -> turkey ...
//
//        Your Task:
//
//        You will be given a list of strings, a transcript of an English Shiritori match. Your task is to find out if the game ended early, and return a list that contains every valid string until the mistake. If a list is empty return an empty list. If one of the elements is an empty string, that is invalid and should be handled.
//
//        Examples:
//
//        All elements valid:
//
//        The array {"dog","goose","elephant","tiger","rhino","orc","cat"}
//
//        should return {"dog","goose","elephant","tiger","rhino","orc","cat"}
//
//        An invalid element at index 2:
//
//        The array {"dog","goose","tiger","cat", "elephant","rhino","orc"}
//
//        should return ("dog","goose") since goose ends in 'e' and tiger starts with 't'
//
//        An invalid empty string at index 2:
//
//        The array {"ab","bc","","cd"}
//
//        should return ("ab","bc")
//
//        All invalid empty string at index 0:
//
//        The array {"","bc","","cd"}
//
//        should return An Empty List


import java.util.ArrayList;
import java.util.List;

public class AnEnglishTwistOnAJapaneseClassic {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("dog");
        list.add("goose");
        list.add("tiger");
        list.add("cat");
        list.add("elephant");
        list.add("rhino");
        list.add("");


        System.out.println(theGame(list));

    }

    
    public static List<String> theGame(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {

            //System.out.println(words.get(i));
            char firstChar = words.get(i + 1).charAt(0);
            char lastChar = words.get(i).charAt(words.get(i).length() - 1);
            //System.out.println("First " + firstChar);
            //System.out.println("Last "+lastChar);
            if (lastChar != firstChar) {
                words.subList(i + 1, words.size()).clear();

            }

        }

        return words;

        //SECOND SOLUTION

//        if (words.isEmpty() || words.get(0).isEmpty()) {
//            return List.of();
//        }
//        String ending = words.get(0).substring(words.get(0).length() - 1);
//        for (int i = 1; i < words.size(); i++) {
//            if (words.get(i).startsWith(ending)) {
//                ending = words.get(i).substring(words.get(i).length() - 1);
//            } else {
//                return words.subList(0, i);
//            }
//        }
//        return words;
    }
}
