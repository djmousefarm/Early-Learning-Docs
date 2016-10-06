public class recurse {

    
public static int prod(int m, int n) {

    if (m == n) {

        return n;

    } else {

        //int recurse = prod(m, n - 1);

        //int result = n * recurse;

        //return result;

        return n * (prod(m,n-1));

    }

}

    
    public static void main (String[] Args) {

        	System.out.println(prod(1, 4));
        
    }

}