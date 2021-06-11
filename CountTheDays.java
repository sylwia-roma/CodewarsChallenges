package CountTheDays;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.DAYS;


public class CountTheDays {

    public static void main(String[] args) {
        System.out.println(countDays(new Date(2021,06,11)));
    }

    public static String countDays(Date d){
        Date now = new Date();
        if (now.equals(d)) return "Today is the day!";
        else if (now.after(d)) return "The day is in the past!";
        else return TimeUnit.DAYS.convert(d.getTime() - now.getTime(), TimeUnit.MILLISECONDS) + " days";



    }
}
