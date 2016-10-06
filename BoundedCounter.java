//  This has it's main class after it so both can be in the same txt file
//  It won't run unless this is put in a separate file for compiling

public class BoundedCounter {

    

    private int value;

    private int upperLimit;



    public BoundedCounter(int upperLimit) {

        // write code here

        this.value = 0;

        this.upperLimit = upperLimit;

    }



    public void next() {

        // write code here

        if (this.value<this.upperLimit) {

            value++;

        } else {

            value = 0;

        }
 
    }


   
    public String toString() {

        // write code here

        if (this.value<10) {

            return "0" + this.value;

        } else {

            return "" + this.value;
        }

    }

    

    public int getValue() {

        return this.value;

    }

    

    public void setValue(int value) {

        if (value>0 && value<=upperLimit) this.value = value;

    }


}


//==================Main.java below this point===================

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            seconds.next();
            
            if (seconds.getValue()==0) {
                minutes.next();
                if (minutes.getValue()==0) {
                    hours.next();
                }                
            }

            System.out.println(hours + ":" + minutes + ":" + seconds);
            i++;
        }

    }
}


// ============Alternative Main.java that behaves like a clock!!===========

public class Main {
    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            seconds.next();
            
            if (seconds.getValue()==0) {
                minutes.next();
                if (minutes.getValue()==0) {
                    hours.next();
                }                
            }            
        }
    }
}
    