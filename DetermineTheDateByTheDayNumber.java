package DetermineTheDateByTheDayNumber;

//What date corresponds to the nth day of the year?
//        The answer depends on whether the year is a leap year or not.
//
//        Write a function that will help you determine the date if you know the number of the day in the year, as well as whether the year is a leap year or not.
//        The function accepts the day number and a boolean value isLeap as arguments, and returns the corresponding date of the year as a string "Month, day".
//        Only valid combinations of a day number and isLeap will be tested.
//
//        Examples:
//
//        getDay(41, false)   =>  "February, 10"  //  41st day of non-leap year is February, 10
//        getDay(60, false)   =>  "March, 1"      //  60th day of non-leap year is March, 1
//        getDay(60, true)    =>  "February, 29"  //  60th day of leap year is February, 29
//        getDay(365, false)  =>  "December, 31"  //  365th day of non-leap year is December, 31
//        getDay(366, true)   =>  "December, 31"  //  366th day of leap year is December, 31


import java.time.LocalDateTime;
import java.util.Locale;

public class DetermineTheDateByTheDayNumber {

    public static void main(String[] args) {
        System.out.println(getDay(60, true));
        System.out.println(getDay(60, false));

    }

    public static String getDay(int day, boolean isLeap) {
        LocalDateTime dt;
        if(isLeap){
            dt = LocalDateTime.of(2016, 01, 01,0, 0, 0, 0);
        } else {
            dt = LocalDateTime.of(2017, 01, 01,0, 0, 0, 0);
        }



        LocalDateTime myDateObj = LocalDateTime.from(dt).plusDays(day-1);

        String month = myDateObj.getMonth().toString();

        int dayOfMonth = myDateObj.getDayOfMonth();

        String ret = month.substring(0, 1) + month.substring(1).toLowerCase(Locale.ROOT) + ", " + String.valueOf(dayOfMonth);


        return ret;


//        int[] days = {31, isLeap ? 29 : 28, 31,30,31,30,31,31,30,31,30,31};
//        String[] months = {"January", "February", "March", "April", "May", "June",
//                "July", "August", "September", "October", "November", "December"};
//        int i;
//        for(i =0; i<12; i++){
//            if(day <= days[i])
//                break;
//            day -= days[i];
//        }
//        return months[i] + ", " + day;

    }


}
