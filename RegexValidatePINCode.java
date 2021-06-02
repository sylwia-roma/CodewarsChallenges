package RegexValidatePINCode;
//
//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//
//        Examples
//
//        "1234"   -->  true
//        "12345"  -->  false
//        "a234"   -->  false

public class RegexValidatePINCode {

    public static void main(String[] args) {
        System.out.println(validatePin("12345"));
    }

    public static boolean validatePin(String pin) {
        boolean flag = false;
        if(pin.length()==4||pin.length()==6){
            for(int i=0; i<pin.length(); i++){
                if(pin.matches("^[0-9]*$")){
                    flag = true;
                } else{
                    flag = false;
                }
            }

        } else{
            flag = false;
        }
        return flag;

    }
}
