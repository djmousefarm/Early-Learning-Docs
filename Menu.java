import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here
    public void addMeal(String meal) {
        if (!(this.meals.contains(meal))) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
    
    public static void main (String[] args) {
        Menu Todays = new Menu();
        
        Todays.addMeal("Cheese");
        Todays.addMeal("Sausages");
        Todays.addMeal("Pizza");
        
        Todays.printMeals();
        
        Todays.addMeal("Cheese");
        
        Todays.printMeals();
        
        Todays.clearMenu();
        
        System.out.println("What meals are there now? ");
        Todays.printMeals();
    }
}
 