import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int number,guess, difference;
        
        // pick a random number
        Random random = new Random();
        number = random.nextInt(100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number:");
        
        guess = in.nextInt();
        
        if (number>guess) {
            difference = number - guess;
        } else {
            difference = guess - number;
        }
        
        System.out.printf("Your guess is %d",guess);
        System.out.println("");
        
        System.out.printf("The number I was thinking of was : %d",number);
        System.out.println("");
        
        System.out.printf("Your were off by : %d",difference);
    }
}