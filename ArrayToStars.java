// This will need to be renamed as Main.java to compile!

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // code here
        for (int i = 0;i<array.length;i++) {
            
            for (int j = 0;j<array[i];j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
 