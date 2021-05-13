//a and b will both be positive integers, and a will always be the first number
// in the operation, and b always the second.
//
//        The four operators are "add", "subtract", "divide", "multiply".
//
//        A few examples:
//
//        arithmetic(5, 2, "add")      => returns 7
//        arithmetic(5, 2, "subtract") => returns 3
//        arithmetic(5, 2, "multiply") => returns 10
//        arithmetic(5, 2, "divide")   => returns 2.5
//        ArithmeticFunction.arithmetic(5, 2, "add")      => returns 7
//        ArithmeticFunction.arithmetic(5, 2, "subtract") => returns 3
//        ArithmeticFunction.arithmetic(5, 2, "multiply") => returns 10
//        ArithmeticFunction.arithmetic(5, 2, "divide")   => returns 2

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int arithmetic(int a, int b, String operator) {
        int score = 0;
        if(operator=="add") {
            score =  a+b;
        } else if(operator=="subtract") {
            score = a-b;
        }
        else if(operator=="multiply") {
            score = a*b;
        }
        else if(operator=="divide") {
            score = a/b;
        }
        return score;
    }
}
