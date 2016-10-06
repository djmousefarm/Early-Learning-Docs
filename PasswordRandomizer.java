// Need to split out the PasswordRandomizer from the Program class for this to compile!

import java.util.Random;



public class PasswordRandomizer {

    Random random = new Random();

    private int length;

    

    public PasswordRandomizer(int length) {

        this.length = length;

    }

    

    public String createPassword() {

        String alphabet = "abcdefghijklmnopqrstuvmwxyz";

        String output = "";

        for (int i = 0;i < length;i++) {

            int letter = random.nextInt(26)+1;

            output = output + alphabet.charAt(letter);

        }

        return output;

    }

}

//  =========Program class==========

public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}