//  There are two different classes in this file LotteryNumbers.java and
//  Program.java at the bottom!

import java.util.ArrayList;

import java.util.Random;



public class LotteryNumbers {

    private Random random = new Random();

    private ArrayList<Integer> numbers;


    public LotteryNumbers() {

        // We'll format a list for the numbers

        this.numbers = new ArrayList<Integer>();

        // Draw numbers as LotteryNumbers is created

        this.drawNumbers();

    }



    public ArrayList<Integer> numbers() {

        return this.numbers;

    }



    public void drawNumbers() {

        // Write the number drawing here using the method containsNumber()

        while(this.numbers.size()<7) {

            int rand = random.nextInt(39)+1;

            if (!containsNumber(rand)) {

                this.numbers.add(rand);

            }

        }

    }



    public boolean containsNumber(int number) {

        // Test here if the number is already among the drawn numbers

        return (this.numbers.contains(number));

    }

}


// ====================Program.java========================

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}