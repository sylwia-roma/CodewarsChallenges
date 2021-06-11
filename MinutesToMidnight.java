package MinutesToMidnight;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Teemo is not really excited about the new year's eve, but he has to celebrate it with his friends anyway.
//
//        He has a really big passion about programming and he wants to be productive till midnight. He wants to know how many minutes he has left to work on his new project.
//        He doesn't want to look on the clock all the time, so he thought about a function, which returns him the number of minutes.
//
//        Can you write him a function, so he can stay productive?
//        get a date object with of today with a random timestamp.
//        You have to round the number of minutes.
//        Milliseconds doesn't matter!
//
//        Some examples:
//
//        10.00 am => "840 minutes"
//        23.59 pm => "1 minute"
//        The function minutesToMidnight(d) will take a date object as parameter. Return the number of minutes in the following format:
//
//        "x minute(s)"
//
//        You will always

public class MinutesToMidnight {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 11);
        cal.set(Calendar.MINUTE, 45);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d = cal.getTime();
        System.out.println(countMinutes(d));
    }

    public static String countMinutes(Date d1){


        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d2 = cal.getTime();

        long diff = d2.getTime() - d1.getTime();

        long diffMinutes = diff / (60 * 1000);

        if(diffMinutes==1){
            return diffMinutes + " minute";
        } else {
            return diffMinutes + " minutes";
        }

//        int mins=(24-d.getHours()-1)*60+60-d.getMinutes();
//        if (d.getHours()==23 && d.getMinutes()==59) return "1 minute";
//        return (d.getSeconds()!=0)?  ""+(mins-1)+" minutes" : ""+mins+" minutes";

        //System.out.println(diffMinutes);

    }
}
