import java.util.Scanner;



public class FirstChar {

    
    public static void main (String[] args) {

        	Scanner in = new Scanner(System.in);

        	System.out.print("Type your name:");


        	String s = in.nextLine();

        	System.out.print("First Character: " + s.charAt(0));

        

    }

}