
//Write Number in Expanded Form
//
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(expandedForm(4573));
    }

    public static String expandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;


//      SECOND SOLUTIONS
//  !!!!!!!!!!!!!!!!!!!!!!!!!!
//        int count = 0;
//        String zero = "";
//        String newString = "";
//        int num2=num;
//
//        while(num2!=0){
//            num2/=10;
//            count++;
//        }
//
//
//        //System.out.println("Count" + count);
//        while(num!=0) {
//            double b = Math.pow(10, count - 1);
//            int c = (int) Math.floor(num / b);
//            //System.out.println("B" + b);
//            //System.out.println("c" + c);
//            num %= b;
//            //System.out.println("Num" + num);
//
//
//            for (int i = 0; i < count - 1; i++) {
//                zero += "0";
//            }
//
//            //System.out.println("zero " + zero);
//            if(c!=0) {
//                newString += c + zero + " + ";
//            }
//            //System.out.println("NewString " + newString);
//            zero="";
//            count--;
//        }
//
//        String subString = newString.substring(0, newString.length()-2);
//        return subString;
    }
}
