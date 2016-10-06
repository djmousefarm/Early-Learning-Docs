import java.util.Scanner;



public class NameLength {

    
    public static void main (String[] args){

        	Scanner in = new Scanner(System.in);

        
        System.out.print("Type your name :");

        	String s = in.nextLine();

        
        System.out.println("Number of characters:" + s.length());

    }

}