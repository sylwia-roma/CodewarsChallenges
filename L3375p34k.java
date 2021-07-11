package L3375p34k;

public class L3375p34k {
    public static void main(String[] args) {

        Leetspeak myEncoder = new Leetspeak();
        System.out.println(myEncoder.encode("abcdef"));


    }

}

class Leetspeak extends Encoder{

    public String encode(String source){
        if(source == null || source == "") {
            return "";
        }

        String newString = source.replaceAll("[aA]", "4")
                        .replaceAll("[eE]", "3").replaceAll("[lL]", "1")
                        .replaceAll("[mM]", "/^^\\\\").replaceAll("[oO]", "0")
                        .replaceAll("[uU]", "(_)");

        return newString;
    }

}

abstract class Encoder{
    public abstract String encode(String source);
}
