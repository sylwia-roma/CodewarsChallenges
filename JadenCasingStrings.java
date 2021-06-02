package JadenCasingStrings;

//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010)
// and After Earth (2013). Jaden is also known for some of his philosophy that he delivers
// via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
// For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
//
//        Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//        Example:
//
//        Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//        Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"


import java.util.Locale;

public class JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        if (phrase=="" || phrase==null){
            return null;
        }
        String[] s = phrase.split(" ");
        //System.out.println(Arrays.toString(s));

        for(int i=0; i<s.length; i++){
            String firstLetter = s[i].substring(0,1).toUpperCase(Locale.ROOT);
            String remainsLetter = s[i].substring(1,s[i].length());

            s[i] = firstLetter+remainsLetter;
            //System.out.println(s[i]);
        }

        String join = String.join(" ", s);

        return join;
    }
}
