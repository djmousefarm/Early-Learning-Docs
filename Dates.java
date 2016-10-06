import java.util.Scanner;



public class Dates {


    public static void printAmerican (String day, String month, int date, int year) {

        System.out.println(day + ", " + month + " " + date + ", " + year);

    }

    

    public static void printEuropean (String day, String month, int date, int year) {

        System.out.println(date + " " + month + " " + year + " " + day);

    }



    public static void main (String[] args) {

        printAmerican("Saturday", "July", 22, 2005);

        printEuropean("Saturday", "July", 22, 2005);

    }


}