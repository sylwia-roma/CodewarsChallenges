package BreakCamelCase;

//Complete the solution so that the function will break up camel casing, using a space between words.
//
//        Example
//
//        "camelCasing"  =>  "camel Casing"
//        "identifier"   =>  "identifier"
//        ""             =>  ""

import java.util.Arrays;
import java.util.stream.Collectors;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input) {
//        return Arrays.stream(input.split(""))
//                .map(s -> s.matches("[A-Z]") ? " " + s : s)
//                .collect(Collectors.joining());


        String[] a = input.split("(?=[A-Z])");
        System.out.println(Arrays.toString(a));
        String join = String.join(" ", a);


        return join;
    }
}
