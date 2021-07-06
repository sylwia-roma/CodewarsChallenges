package RowWeights;

import java.util.Arrays;

public class RowWeights {
    public static void main(String[] args) {
        System.out.println(rowWeights(new int[]{50,60,70,80}));
        System.out.println(rowWeights(new int[]{29,83,67,53,19,28,96}));
    }

    public static int[] rowWeights (final int[] weights) {
        int aWeight=0;
        int bWeight=0;

        for(int i =0; i<weights.length; i++) {

            if(i%2==1){
                aWeight+=weights[i];
            }
            else if(i%2==0){
                bWeight+=weights[i];
            }
        }
        int[] weight = new int[]{bWeight, aWeight};
        //System.out.println(Arrays.toString(weight));
        return weight;

    }
}
