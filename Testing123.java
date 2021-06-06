package Testing123;

import java.util.ArrayList;
import java.util.List;

//Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
//
//        Write a function which takes a list of strings and returns each line prepended by the correct number.
//
//        The numbering starts at 1. The format is n: string. Notice the colon and space in between.
//
//        Examples:
//
//        number(Arrays.asList()) # => []
//        number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]

public class Testing123 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println(number(myList));


    }

    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            String num = Integer.toString(i + 1);
            String line = lines.get(i);
            String a = num + ": " + line;

            lines.set(i, a);
        }

        return lines;
    }
}
