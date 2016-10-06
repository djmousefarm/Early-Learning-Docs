import java.util.Scanner;



public class reverse {

    
    public static void main (String[] args) {

        	Scanner in = new Scanner(System.in);
 
       	 	System.out.print("Type your name:");

        	String s = in.nextLine();

        	int count = s.length();

        
        while(count>0) {

            		count--;

            		System.out.print(s.charAt(count));

        	}

        }

}