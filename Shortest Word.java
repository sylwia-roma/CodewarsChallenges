//Simple, given a string of words, return the length of the shortest word(s).

//String will never be empty and you do not need to account for different data types.

public class Main {

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));

    }

    public static int findShort(String s) {
        String[] testArray = s.split(" ");
        int count =0;
        int min = Integer.MAX_VALUE;


        for(int i=0; i<testArray.length; i++){

            count = testArray[i].length();
            //System.out.println("Count [" + i + "]" + count);
            if(count<=min){
                min=count;
            }
        }
        return min;
    }
}
