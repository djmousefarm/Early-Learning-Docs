import java.util.Scanner;



public class SeparateAll {

    
    public static void main (String[] args) {

        	Scanner in = new Scanner(System.in);

        	System.out.print("Type your name :");

        	String s = in.nextLine();

        	int count = 0;

        	while(count<s.length()) {

            		System.out.println((count+1) + ". character :" + s.charAt(count));

            		count++;

        	}

        

    	}

}