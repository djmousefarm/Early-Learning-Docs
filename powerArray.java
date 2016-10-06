public class Main{



     public static void main(String []args){

        double myArray[] = {2.0, 3.0, 4.0, 5.0};

        double powArray[] = power(myArray,4.0);

        for (double value : powArray) {

            System.out.println(value);

        }

     }

     

    public static double[] power(double[] a, double power) {

        double pow[] = new double[a.length];

        for (int i = 0; i < a.length; i++) {

            pow[i] = Math.pow(a[i],power);

        }

        return pow;

    }
    
 
   
  
}
