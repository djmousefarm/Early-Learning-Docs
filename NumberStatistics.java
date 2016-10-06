//  The main class is below NumberStatistics and will need to be put in it's own class for this
//  to work

public class NumberStatistics {

    private int amountOfNumbers;

    private int sum;

    

    public NumberStatistics() {

        this.amountOfNumbers = 0;

    }


    public int amountOfNumbers() {

        // code here
        return this.amountOfNumbers;

    }
 
   
 
    public void addNumber(int number) {

        // code here

        this.amountOfNumbers++;

        this.sum = sum() + number;

    }

    

    public int sum() {

        return this.sum;

    }

    

    public double average() {

        return (sum*1.0)/amountOfNumbers;

    }


}


// ============Below is Main.java===========

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        
        System.out.println("Type numbers:");        
        
        while(true) {
            int addNumber = Integer.parseInt(reader.nextLine());
            if (addNumber>=0) {
                stats.addNumber(addNumber);
                
                if (addNumber%2==0) {
                    evenStats.addNumber(addNumber);
                } else { 
                    oddStats.addNumber(addNumber);
                }
                
            } else {
                break;
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
    