//Your task is to return how many times a string contains a given character.
//
//        The function takes a string(inputS) as a parameter and a char(charS)
//        which is the character that you will have to find and count.
//
//        For example, if you get an input string "Hello world" and the character to find is "o", return 2.




public class Main {
    public static void main(String[] args) {
        System.out.println(stringCounter("Hello World", 'l'));
    }

    public static int stringCounter(String inputS, char charS){
        char[] array = new char[inputS.length()];
        int count = 0;


        for(int i=0; i<inputS.length(); i++) {
            array[i] = inputS.toLowerCase().charAt(i);
            if(array[i]==charS){
                count++;
            }
        }
        return count;
    }
}
