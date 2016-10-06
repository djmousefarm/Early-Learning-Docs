import java.util.Scanner;



public class Temperature {

    
    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);

        
        Double centigrade,fahrenheit;
 
       
         // Ask for a value to be input

	        System.out.print("Enter your temperature in Centigrade :");
 
	        centigrade = in.nextDouble(); 

        
        fahrenheit = (centigrade*(9.0/5.0))+32;

        
        System.out.printf("%.1f fahrenheit",fahrenheit);

        
    }

}