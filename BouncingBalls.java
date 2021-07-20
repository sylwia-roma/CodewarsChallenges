package BouncingBalls;

public class BouncingBalls {
    public static void main(String[] args) {
        //System.out.println(bouncingBall(3.0, 0.66, 1.5));
        //System.out.println(bouncingBall(3.0, 1, 1.5));
        System.out.println(bouncingBall(2.0, 0.5, 1.0));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        double score = (h*bounce);
        int count = 1;
        if(bounce<=0||bounce>=1||window>=h||h<=0){
            return -1;
        }

        while(score>window){
            count+=2;
            score*=bounce;

//            System.out.println("Score" + score);
//            System.out.println(count);
        }

        return count;

    }
}
