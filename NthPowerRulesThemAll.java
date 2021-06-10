package NthPowerRulesThemAll;

//You are provided with an array of positive integers and an additional integer n (n > 1).
//
//        Calculate the sum of each value in the array to the nth power. Then subtract the sum of the original array.
//
//        Examples
//
//        {1, 2, 3}, 3  -->  (1^3 + 2^3 + 3^3 ) - (1 + 2 + 3)  -->  36 - 6  -->  30
//        {1, 2}, 5     -->  (1^5 + 2^5) - (1 + 2)             -->  33 - 3  -->  30

public class NthPowerRulesThemAll {

    public static void main(String[] args) {
        System.out.println(modifiedSum(new int[] {1,2,3}, 3));
    }

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;

        for(int i=0; i< array.length; i++) {
            sum+=Math.pow(array[i], power)-array[i];

        }
        return sum;
    }
}
