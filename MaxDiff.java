package MaxDiff;

//You must implement a function that return the difference between the biggest and the smallest
// value in a list(lst) received as parameter.
//
//        The list(lst) contains integers, that means it may contain some negative numbers.
//
//        If the list is empty or contains a single element, return 0.
//
//        The list(lst) is not sorted.
//
//        maxDiff([1, 2, 3, 4]); // return 3, because 4 - 1 == 3
//        maxDiff([1, 2, 3, -4]); // return 7, because 3 - (-4) == 7
//        Have fun!

public class MaxDiff {
    public static void main(String[] args) {

        int[] a = new int[]{};

        System.out.println(maxDiff(a));
    }


    public static int maxDiff(int[] lst) {
        if(lst.length==0){
            return 0;
        }

        int maxValue = lst[0];
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] > maxValue) {
                maxValue = lst[i];
            }
        }

        int minValue = lst[0];
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] < minValue) {
                minValue = lst[i];
            }
        }

        int diff = maxValue - minValue;


        return diff;
    }
}
