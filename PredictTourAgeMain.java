package PredictYourAge;

//My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!
//
//        In honor of my grandfather's memory we will write a function using his formula!
//
//        Take a list of ages when each of your great-grandparent died.
//        Multiply each number by itself.
//        Add them all together.
//        Take the square root of the result.
//        Divide by two.
//        Example
//
//        predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
//        Note: the result should be rounded down to the nearest integer.
//
//        Some random tests might fail due to a bug in the JavaScript implementation. Simply resubmit if that happens to you.

public class PredictTourAgeMain {
    public static void main(String[] args) {

    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        double pow = Math.pow(age1, 2) + Math.pow(age2, 2) + Math.pow(age3, 2) + Math.pow(age4, 2) + Math.pow(age5, 2) + Math.pow(age6, 2)
                + Math.pow(age7, 2) + Math.pow(age8, 2);

        int score = (int)Math.sqrt(pow)/2;

        return score;
    }
}
