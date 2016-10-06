//  Will need to be renamed as Main.java to compile!

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};

        int[] reverse = reverseCopy(original);


        // print both

        System.out.println( "original: " +Arrays.toString(original));

        System.out.println( "reversed: " +Arrays.toString(reverse));

    }

    
    

    public static int[] copy(int[] array) {

        int[] newCopy = new int[array.length];

        for (int i=0;i<array.length;i++) {

            newCopy[i] = array[i];

        }

        return newCopy;

    }

    

    public static int[] reverseCopy(int[] array) {

        int[] newCopy = new int[array.length];

        int i = array.length;

        int j = 0;

        while (i>0) {

            i--;

            newCopy[j] = array[i];

            j++;

        }

        return newCopy;

    }

  
}
