package RegexpBasicsIsItAVowel;

//Implement the function which should return true if given object is a vowel
// (meaning a, e, i, o, u), and false otherwise.

public class RegexpBasicsIsItAVowel {
    public static void main(String[] args) {
        System.out.println(isVowel("a"));
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiou|AEIOU]");
    }
}
