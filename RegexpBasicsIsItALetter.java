package RegexpBasicsIsItALetter;

public class RegexpBasicsIsItALetter {
    public static void main(String[] args) {
        System.out.println(isLetter("a"));
    }
    public static boolean isLetter(String s) {
        return s.matches("[A-Za-z]");
    }
}
