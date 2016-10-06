public class Time{


     public static void main(String []args){


        int hour = 14;

        int minute = 23;

        int seconds = 42;

        

        int totalSeconds = seconds + (minute*60) + (hour*60*60);

        

        System.out.println(totalSeconds);

        

        int remainingSeconds = (24*60*60)-totalSeconds;

        

        System.out.println(remainingSeconds);

        

        double percentageTime = 100.0 * (totalSeconds / (24.0*60*60));

        

        System.out.println(percentageTime);

        

        hour = 14;

        minute = 33;

        seconds = 21;

        

        int currentSeconds = seconds + (minute*60) + (hour*60*60);

        

        System.out.print("Time passed since program started :");

        System.out.println(currentSeconds-totalSeconds);

        

        }

    }