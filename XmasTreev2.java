public class XmasTreev2 {

    private static void printStars (int amount) {
        int count = 0;
        while (count<amount) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }
    
    private static void printWhiteSpaces (int amount) {
        int count = 0;
        while (count<amount) {
            System.out.print(" ");
            count++;
            }
    }
    
    private static void printTriangle (int size) {
        int count = 0;
        int whiteCount = size;
        while (count<=size) {
            printWhiteSpaces(whiteCount);
            printStars(count);
            count++;
            whiteCount--;
        }
        
    }
    
    private static void xmasTreeBase (int position) {
        int count = 0;
        while(count<2) {
            printWhiteSpaces(position-1);
            printStars(3);
            count++;
        }
    }
    
    private static void xmasTree (int height) {
        int count = height;
        int stars = 1;
        while(count>=0) {
            printWhiteSpaces(count);
            printStars(stars);
            stars += 2;
            count--;
        }
        xmasTreeBase(height);
    }
    
    public static void main(String[] args) {
        xmasTree(4);
    }
    
}
