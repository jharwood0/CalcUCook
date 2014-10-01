
package calcucook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calcucook {

    public static void main(String[] args) {
        //vars
        Scanner input = new Scanner(System.in);
        ArrayList<Food> fooditems = new ArrayList<>();
                
        System.out.println("How many food items are you cooking?");
        int i = input.nextInt();
        
        //asks user for name and cooking time
        for (int j = 1; j <= i; j++) {
            Food temp_food = new Food();
            System.out.println("Please enter the name of food item "+j);
            temp_food.setName(input.next());
            System.out.println("Please enter the cooking time for " + temp_food.getName() + " (Mins)");
            temp_food.setTime(input.nextInt());
            temp_food.setId(j);
            fooditems.add(temp_food);
        }
        
        
        System.out.println();
        System.out.println("System will now calculate when to put in food items"); 
        System.out.println();
        
        //sorts objects based on longest cooking time
        Collections.sort(fooditems, new FoodTimeComparator());
        
        //get(0) is largest cooking time
        //sets the delay for putting on the even and outputs it to user
        for (Food fooditem : fooditems) {
            fooditem.setDelay(fooditems.get(0).getTime() - fooditem.getTime());
            if (fooditem.getDelay() == 0) {
                System.out.println("Put " + fooditem.getName() + " in now!");
            } else {
                System.out.println("Put " + fooditem.getName() + " in " + fooditem.getDelay() + " mins");
            }
        }
        
        System.out.println("System will now create timers for food items");
        //TODO: create timer class
        
    }
}
