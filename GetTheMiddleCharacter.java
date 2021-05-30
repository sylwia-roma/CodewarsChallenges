package GetTheMiddleCharacter;

//You are going to be given a word. Your job is to return the middle character of the word.
//If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
//
//        #Examples:
//
//        Kata.getMiddle("test") should return "es"
//
//        Kata.getMiddle("testing") should return "t"
//
//        Kata.getMiddle("middle") should return "dd"
//
//        Kata.getMiddle("A") should return "A"

public class Main {

    public static void main(String[] args) {
        System.out.println(getMiddle("anewuh"));
    }
    public static String getMiddle(String word) {
        int position = 0;
        int length = 0;

        if(word.length() % 2 == 0) {
            position = word.length()/2-1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }

        return word.substring(position, position+length);
    }

}
