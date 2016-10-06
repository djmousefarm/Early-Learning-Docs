import java.util.Scanner;


public class HelloWorld{


     public static void main(String []args){

        Scanner in = new Scanner(System.in);

        

        while(true) {

            int value = in.nextInt();

            if (value==-1) {

                break;

            } else {

            System.out.println("Number:" + value);

            }

            }

            
    
  }

}