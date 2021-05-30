package DescendingOrder;

public class Main {

    public static void main(String[] args) {
        System.out.println(sortDesc(1234));
    }

    public static int sortDesc(int num) {
        int newNum = 0;

        while(num!=0){
            int lastDigit;
            lastDigit=num%10;
            newNum=newNum*10+lastDigit;
            num=num/10;
        }
        return newNum;
    }
}
