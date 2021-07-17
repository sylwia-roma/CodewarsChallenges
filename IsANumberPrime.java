package IsANumberPrime;

public class IsANumberPrime {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
         System.out.println(isPrime(13));
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;


        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
