public class recurseagain {

    
    public static int oddSum (int n) {

        if (n == 1) {

            return n;

        } else {

            return n + oddSum(n-2);

        }

    }

    
    public static void main (String[] args) {

    	    System.out.println(oddSum(9));

    }

}