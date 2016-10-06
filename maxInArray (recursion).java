// This runs as Main.java

public class Main {


    public static void main(String []args){

        int[] myArray = {10,4,6,12,8,1,7,6,8,4,2,6,19,2,1,0,1,5,10,15};

        System.out.println("10,4,6,12,8,1,7,6,8,4,2,6,19,2,1,0,1,5,10,15");

        System.out.println("Highest value in range 0 - 5 : " + maxInRange(myArray,0,5));

        System.out.println("Highest value in range 10 - 16 : " + maxInRange(myArray,10,16));
        System.out.println("Highest value in range 14 - 17 : " + maxInRange(myArray,14,17));

        System.out.println("Highest value in range 0 - 19 : " + maxInRange(myArray,0,19));
 
       
 
       System.out.println("Highest value in the array : " + max(myArray));

    }


// Iterating through a specified range within an array to find the highest values
// This is being done through recursion
    

    public static int maxInRange (int[] A, int lowIndex, int highIndex) {

        if (lowIndex==highIndex) return A[highIndex];  // Every recursive method needs a base case!
        

        if (A[lowIndex]>A[highIndex]) {

            return maxInRange(A,lowIndex,highIndex-1); // Two methods to reduce the search array

        } else {				       // Remember recursion works by referencing

            return maxInRange(A,lowIndex+1,highIndex); // the method from within itself
        }					       // You just have to make it so that a
    }                                                  // 
parameter adjusts appropriately so it
    
 						       // doesn't repeat ad infinitum
    public static int max (int[] A) {

        return maxInRange(A,0,A.length-1);

    }

}