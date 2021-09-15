
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String Meal) {
        
        if (!this.meals.contains(Meal)) {
            this.meals.add(Meal);
        }
        
    }
    
    public void printMeals() {
        
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i));
        }
    }
    
    public void clearMenu() {
        this.meals.removeAll(meals);
    }
    

    // implement the required methods here
}
