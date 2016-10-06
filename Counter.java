//  Examples of overloading constructors

public class Counter {

    private int startingValue;

    private boolean check;

    private int Value;

    

    public Counter(int inputStartingValue, boolean inputCheck) {

        this.startingValue = inputStartingValue;

        this.check = inputCheck;

        this.Value = inputStartingValue;

    }

    

    public Counter(int inputStartingValue) {         // Remember you don't need to call the main
						     // contructor by name!
        this(inputStartingValue,false);              // this will do! 

    }

    

    public Counter(boolean inputCheck) {

        this(0,inputCheck);

    }
   
 
   
    public Counter() {

        this(0,false);

    }

    

    public int value() {
         // If you want to do maths to your values in the class (in main)
        return this.Value;

    }

    

    public String toString() {
   // If you just want to print it out!
        return "" + this.Value;

    }

    

    public void increase() {

        this.Value++;

    }

    

    public void decrease() {

        if (!(this.check && (this.Value==0))) {
  //         if (!(this.check && (value()==0))) {
            this.Value--;                        //  Above is alternative code that demonstrates 
						 //           method overloading 

        }

    }


// ======== Below this point are alternate methods that also demonstrate method overloading ====
// ======== the rest of this script will likely error unless the two version of the increase ===
// ======== and the decrease methods aren't commented out ======================================

    public void increase(int increaseAmount) {

        if (increaseAmount>0) {

            this.Value+=increaseAmount;

        }

    }

    

    public void increase() {

        increase(1);

    }

    

    public void decrease(int decreaseAmount) {

        if (!(this.check && (value()==0))) {

            if ((this.Value-decreaseAmount>=0) && (decreaseAmount>0)) {

                this.Value-=decreaseAmount;

            }

        }

    }

    

    public void decrease() {

        decrease(1);

    }

}


