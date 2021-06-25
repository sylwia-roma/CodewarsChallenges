package HumanReadableTime;

//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format
// (HH:MM:SS)
//
//        HH = hours, padded to 2 digits, range: 00 - 99
//        MM = minutes, padded to 2 digits, range: 00 - 59
//        SS = seconds, padded to 2 digits, range: 00 - 59
//        The maximum time never exceeds 359999 (99:59:59)
//
//        You can find some examples in the test fixtures.

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(3601));
    }

    public static String makeReadable(int seconds) {
        if(seconds <= 0)return "00:00:00";
        int h = seconds / 3600;
        int m = seconds % 3600 / 60;
        int s = seconds % 60; // Less than 60 is the second, enough 60 is the minute
        String time =  String.format("%02d:%02d:%02d", h, m, s);
        return time;
    }
}
