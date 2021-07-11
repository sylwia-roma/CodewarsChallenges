package HalvingSum;

//Task
//
//        Given a positive integer n, calculate the following sum:
//
//        n + n/2 + n/4 + n/8 + ...
//        All elements of the sum are the results of integer division.
//
//        Example
//
//        25  =>  25 + 12 + 6 + 3 + 1 = 47

public class HalvingSum {
    public static void main(String[] args) {
        System.out.println(halvingSum(25));
        System.out.println(halvingSum(127));

    }

    public static int halvingSum(int n) {
        int sum = 0;
        int num = 1;
        int count = 1;

        while (num>0){
            //System.out.println("Acti");
            num=n/count;
            //System.out.println(num + " " + count);
            sum+=num;
            count*=2;
        }

        return sum;

    }
}
