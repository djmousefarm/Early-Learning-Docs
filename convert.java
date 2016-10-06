import java.util.Scanner;



public class Convert{


     public static void main(String []args){

        Scanner in = new Scanner(System.in);

        int seconds, minutes, hours, requestedSeconds;

        

        System.out.print("Input the number of seconds to convert:");

        seconds = in.nextInt();

        requestedSeconds = seconds;

        

        hours = seconds/3600;
 
        //seconds -= hours*3600;

        seconds = seconds%3600;

        

        minutes = seconds/60;

        //seconds -= minutes*60;

        seconds = seconds%60;

        

        System.out.printf("%d seconds = %d hours, %d minutes, and %d                               seconds",requestedSeconds,hours,minutes,
seconds);

     }

}