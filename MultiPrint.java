import java.util.Scanner;



public class MultiPrint {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = 0;

        int HowMany;

        System.out.print("How many?");

        HowMany = in.nextInt();

        

        while (count<HowMany) {

            printText();

            count++;

            }

        }

        

        public static void printText() {

        System.out.println("In the beginning there were the swamp, the hoe and Java.");

        }

    }