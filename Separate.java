import java.util.Scanner;



public class Separate {

    
    public static void main (String[] args) {

        	Scanner in = new Scanner(System.in);

        	System.out.print("Type your name:");

        	String s = in.nextLine();

        	int count = 0;

        	if (s.length()>3) {

            		while(count<3) {

                		System.out.println((count+1) + ". character:" + s.charAt(count));

                		count++;

            		}

            
     }

    }

}