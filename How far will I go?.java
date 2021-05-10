package com.company;

//You have recently discovered that horses travel in a unique pattern - they're either running (at top speed) or resting (standing still).
//
//        Here's an example of how one particular horse might travel:
//
//        The horse Blaze can run at 14 metres/second for 60 seconds, but must then rest for 45 seconds.
//
//        After 500 seconds Blaze will have traveled 4200 metres.
//        Your job is to write a function that returns how long a horse will have traveled after a given time.
//
//        ####Input:
//
//        totalTime - How long the horse will be traveling (in seconds)
//
//        runTime - How long the horse can run for before having to rest (in seconds)
//
//        restTime - How long the horse have to rest for after running (in seconds)
//
//        speed - The max speed of the horse (in metres/second)

public class Main {

    public static void main(String[] args) {
        System.out.println(travel(25, 50, 120, 18));

    }

    public static int travel(int totalTime, int runTime, int restTime, int speed) {

        int suma=0;
        float licznik = 0;

        if(totalTime<runTime){
            licznik=(float)totalTime/(float)runTime;

        } else{
            for(int i=1; suma<=totalTime; i++){
                suma=i*(runTime+restTime);
                licznik++;

                if(suma==totalTime) {
                    break;
                }
            }
        }
        int wynik = (int) (licznik*speed*runTime);

        return wynik;


        //II SPOSÓB

        //return (totalTime / (runTime + restTime) * runTime * speed) + (Math.min(totalTime % (runTime + restTime), runTime) * speed);

    }
}
