package Ch4113ng3;

//Make your strings more nerdy: Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l'
// with 1 e.g. "Fundamentals" --> "Fund4m3nt41s"

public class Ch4113ng3 {
    public static void main(String[] args) {
        System.out.println(nerdify("Los Angeles"));
    }

    public static String nerdify(String txt){
        String newString = txt;
        newString = newString.replaceAll("A", "4");
        newString = newString.replaceAll("a", "4");
        newString = newString.replaceAll("E", "3");
        newString = newString.replaceAll("e", "3");
        newString = newString.replaceAll("l", "1");


        return newString;

       // return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
    }
}
