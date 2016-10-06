public class Printing {


    public static void main(String[] args) {
        printStars(5);

        printStars(3);

        printStars(9);

        printSquare(4);

        printRectangle(17,3);

        printTriangle(4);

    }



    private static void printStars (int amount) {

        int count = 0;

        while (count<amount) {

            System.out.print("*");

            count++;

        }

        System.out.println();

    }

    

    private static void printSquare (int sideSize) {

        int count = 0;

        while (count<sideSize) {

            printStars(sideSize);

            count++;

        }

    
}

    

    private static void printRectangle (int width, int height) {

        int count = 0;

        while (count<height) {

            printStars(width);

            count++;

        }

    }

    

    private static void printTriangle (int size) {

        int count = 1;

        while(count<=size) {

            printStars(count);

            count++;

        }

    }


}