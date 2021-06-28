package RegexpBasicsIsItADigit;

public class RegexpBasicsIsItADigit {
    public static void main(String[] args) {
        System.out.println(isDigit("2"));
    }

    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }
}
