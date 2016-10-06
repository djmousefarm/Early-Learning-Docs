// This has the separate but relevant main class at the end!  It won't run unless it's
// split into it's two parts!

public class DecreasingCounter {

    

    private int value;

    private int initial;

    

    public DecreasingCounter(int valueAtStart) {

        this.value = valueAtStart;

        this.initial = this.value;

    }

    

    public void printValue() {

        System.out.println("value: " + this.value);

    }

    

    public void decrease() {

        if (this.value>0) {

            this.value--;

        }

    }

    

    public void reset() {

        this.value=0;
    }

    

    public void setInitial() {

        this.value = this.initial;

    }

    

}



public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}