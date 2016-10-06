import java.util.Scanner;



public class LastChar {

    
    public static void main (String[] args) {

        

        Scanner in = new Scanner(System.in);

        System.out.print("Type your name:");

        String s = in.nextLine();

        System.out.print("Last character :" + s.charAt(s.length()-1));

    }

}