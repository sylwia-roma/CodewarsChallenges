import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(longest("abcde", "fgha"));
    }

    public static String longest (String s1, String s2) {
        String longerString = s1+s2;

        char array[] = longerString.toCharArray();

        Arrays.sort(array);

        int j=0;
        int len= array.length;

        for(int i=0; i<len-1; i++){
            if(array[i]!=array[i+1]){
                array[j++]=array[i];
            }
        }
        array[j++]=array[len-1];

        String newString = "";

        for(int k=0; k<j; k++){
            System.out.println(array[k] + " ");
            newString+=array[k];
        }


        return newString;
    }
}
