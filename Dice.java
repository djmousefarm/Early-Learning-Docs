// Code won't work until the Dice and Program Classes are split out

import java.util.Random;



public class Dice {

    private Random random;

    private int numberOfSides;


    public Dice(int numberOfSides){

        this.numberOfSides = numberOfSides;

        random = new Random();


    }



    public int roll() {

          // we'll get a random number in the range 1-numberOfSides<

          return this.random.nextInt(this.numberOfSides)+1;

    }

}
  

// ========Program.java======= (This is the bit to compile)

public class Program {
    public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
}  
