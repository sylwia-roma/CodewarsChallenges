package RomanNumeralsEncoder;


//Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//        Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
//
//        Example:
//
//        conversion.solution(1000); //should return "M"
//        Help:
//
//        Symbol    Value
//        I          1
//        V          5
//        X          10
//        L          50
//        C          100
//        D          500
//        M          1,000
public class RomanNumeralsEncoder {
    public static void main(String[] args) {
        System.out.println(solution(6006));
    }

    public static String solution(int num) {
        String[] romanCharacters = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
        int[] romanValues = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String result = "";

        for (int i = 0; i < romanValues.length; i++) {
            int numberInPlace = num / romanValues[i];
            if (numberInPlace == 0) continue;
            result += numberInPlace == 4 && i > 0? romanCharacters[i] + romanCharacters[i - 1]:
                    new String(new char[numberInPlace]).replace("\0",romanCharacters[i]);
            num = num % romanValues[i];
            System.out.println(numberInPlace);
            System.out.println(result);
        }
        return result;


//  SECOND SOLUTION
//        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        StringBuilder result = new StringBuilder();
//        int i = 0;
//        while (number > 0 || arab.length == (i - 1)) {
//            while ((number - arab[i]) >= 0) {
//                number -= arab[i];
//                result.append(romanNumbers[i]);
//            }
//            i++;
//        }
//        return result.toString();
    }

}
