public class lesser {

    
    public static int lesser (int number1, int number2) {

        if (number1<number2) {

            return number1;

        } else if (number1>number2) {

            return number2;

        } else {

            return number2;

        }

    }

    

    
public static void main (String[] args) {

    	int answer = lesser(2,7);

    	System.out.println("Least: " + answer);

    }

}