public class squareroot {

    
    public static double squareRoot (int a) {

        double x = a/2.0;

        double check = 0;

        do {

            check = x;

            x = (x + a/x)/2;

        } while(Math.abs(x-check)>0.000001);


        return x;

    }
 
   
 
public static void main (String[] args) {

        System.out.println("Square root of 7");

        System.out.println(squareRoot(7));

    }

}