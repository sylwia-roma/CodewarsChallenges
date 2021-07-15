package CircularlySortedArray;
//
//        [2, 3, 4, 5, 0, 1]       -->  [0, 1] + [2, 3, 4, 5]
//        [4, 5, 6, 9, 1]          -->  [1] + [4, 5, 6, 9]
//        [10, 11, 6, 7, 9]        -->  [6, 7, 9] + [10, 11]
//        [1, 2, 3, 4, 5]          -->  [1, 2, 3, 4, 5]
//        [5, 7, 43, 987, -9, 0]   -->  [-9, 0] + [5, 7, 43, 987]
//        [1, 2, 3, 4, 1]          -->  [1] + [1, 2, 3, 4]

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CircularlySortedArray {
    public static void main(String[] args) {
        int[] A={15,16,9,10,14};
        int[] B={8, 7, 6, 5, 4, 3};
        int[] C={6, 7, 4, 8};
        int[] D={1, 2, 3, 4, 1};
        int[] E={1, 2, 3, 4, 5};

        System.out.println(isCircleSorted(A));
        System.out.println(isCircleSorted(B));
        System.out.println(isCircleSorted(C));
        System.out.println(isCircleSorted(D));
        System.out.println(isCircleSorted(E));
    }

    public static boolean isCircleSorted(int[] a) {
        int br = 0;

        for(int i=0; i<a.length-1; i++) {
            if(a[i]>a[i+1]){
                br=i;
            }
        }

        int[] newArray1 = new int[br+1];
        int[] newArray2 = new int[a.length-br-1];
//        System.out.println(newArray1.length);
//        System.out.println(newArray2.length);


        for(int i=0; i<newArray1.length; i++){
            newArray1[i]=a[i];
        }
        for(int i=0; i< newArray2.length; i++){
            newArray2[i]=a[i+br+1];
        }
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));
        int[] newArray3 = new int[a.length];
        for(int i=0; i< newArray3.length; i++) {
            if(newArray1[0]>=newArray2[0]){
                newArray3 = IntStream.concat(Arrays.stream(newArray2), Arrays.stream(newArray1)).toArray();
            } else {
                newArray3 = IntStream.concat(Arrays.stream(newArray1), Arrays.stream(newArray2)).toArray();
            }
        }

        System.out.println("New Array"+Arrays.toString(newArray3));

        boolean flag=false;

        for(int i=0; i< newArray3.length-1; i++) {
            if(newArray3[i]<=newArray3[i+1]){
                flag=true;
            }
            else {
                flag=false;
                break;
            }
        }

        return flag;

//        int disorder = 0;
//        for (int i = 0; i < a.length; ++i)
//            if (a[(i==0 ? a.length : i)-1] > a[i])
//                ++disorder;
//        return disorder <= 1;
    }
}
