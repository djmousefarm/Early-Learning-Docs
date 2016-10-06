import java.util.Scanner;

import java.util.Random;

    

public class Guessing {



    public static int rand () {

        Random random = new Random();

        return random.nextInt(100) + 1;

    }

    

    public static boolean moreOrLess(int value, int otherValue) {

        if(value>otherValue) {

            System.out.println("The number is greater");

            return false;

        } else if (value<otherValue) {

            System.out.println("The number is lesser");

            return false;

        } else {

            System.out.println("Congratulations, your guess is correct!");

            return true;

        }

    }



    public static int Guess () {

        Scanner reader = new Scanner(System.in);
        
 
       System.out.print("Guess a number:");

        int guess = Integer.parseInt(reader.nextLine);

        return guess;

    }
    

    public static void main (String[] args) {

       
 
        int myNumber = rand();

        boolean status = false;

        

	while (!status) {

            int theirGuess = Guess();

            status = moreOrLess(myNumber,theirGuess);

        }

    }

}