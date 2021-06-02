package FindTheOddInt;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.

public class FindTheOddInt {

    public static void main(String[] args) {

        int[] b = new int[]{10};
        System.out.println(findIt(b));
    }

    public static int findIt(int[] a) {
        int count = 0;
        int number = 0;

        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            for (int j = 0; j < a.length; j++) {
                if (tmp == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                number = tmp;
            }
            System.out.println(tmp + " = " + count);
            count = 0;
        }

        return number;
    }
}
