package TargetDate;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class TargetDate {

//    You have an amount of money a0 > 0 and you deposit it with an interest rate
//    of p percent divided by 360 per day on the 1st of January 2016. You want to have an amount a >= a0.
//
//            Task:
//
//    The function date_nb_days (or dateNbDays...) with parameters a0, a, p will return, as a string,
//    the date on which you have just reached a.
//
//            Example:
//
//    date_nb_days(100, 101, 0.98) --> "2017-01-01" (366 days)
//
//    date_nb_days(100, 150, 2.00) --> "2035-12-26" (7299 days)
//
//    Notes:
//
//    The return format of the date is "YYYY-MM-DD"
//    The deposit is always on the "2016-01-01"
//    Don't forget to take the rate for a day to be p divided by 36000 since banks consider that there are 360 days in a year.
//    You have: a0 > 0, p% > 0, a >= a0



    public static void main(String[] args) {
        System.out.println(dateNbDays(100, 101, 0.98));
        System.out.println(dateNbDays(100, 150, 2.00));
    }

    public static String dateNbDays(double a0, double a, double p) {
        int days = 0;
        double deposit = a0;

        //counting amount of days when a0 will be higher than a
        while(deposit<a){
            deposit+=(deposit*p)/36000;
            days++;
        }

        //counting the date
        LocalDateTime dt = LocalDateTime.of(2016, 01, 01,0, 0, 0, 0);
        LocalDateTime myDateObj = LocalDateTime.from(dt).plusDays(days);
        //System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        String formattedDate = myDateObj.format(myFormatObj);
        //System.out.println("After formatting: " + formattedDate);

        return formattedDate;
    }


}
