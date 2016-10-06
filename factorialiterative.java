public class factorialiterative {

    
   
 
    public static int recursefactorial(int n) {

        if (n == 0) return 1;

        

        int recurse = factorial(n - 1);

        int result = n * recurse;

        return result;

    }

    

    public static int factorial(int n) {

    //    if (n == 0) return 1;

        int out = 1;

        for (int i = 1; i <= n; i++) {

            out = i * out;

        }

        return out;

    }

    

    public static void main (String[] args) {

        System.out.println(recursefactorial(5));

        

        System.out.println(factorial(5));

    }

}