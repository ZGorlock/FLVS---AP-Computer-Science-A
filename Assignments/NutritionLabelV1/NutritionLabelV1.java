
/**
 * The purpose of this program is to display nutrition facts about a meal.
 * 
 * Zachary Gill
 * 11-11-2012
 */

import java.util.Scanner;
public class NutritionLabelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int drvCal = 2000;                          //max daily calories
        int drvFat = 65;                            //fat DRV    
        int drvCarbs = 300;                         //carbohydrates DRV       
        int drvFiber = 25;                          //fiber DRV
        int drvProtein = 50;                        //protein DRV
  
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = in.nextInt();
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / drvCal;
        boolean isTotalCalories = totalCalories < drvCal;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalFat = in.nextInt();
        totalFat = totalFat * servingSize;
        int percentTotalFat = totalFat * 100 / drvFat;
        boolean isTotalFat = totalFat < drvFat;
        
        //carbs
        System.out.print("Enter grams of Carbohydrate per serving: ");
        int totalCarbs = in.nextInt();
        totalCarbs = totalCarbs * servingSize;
        int percentTotalCarbs = totalCarbs * 100 / drvCarbs;
        boolean isTotalCarbs = totalCarbs < drvCarbs;
        
        //fiber
        System.out.print("Enter grams of Fiber per serving: ");
        int totalFiber = in.nextInt();
        totalFiber = totalFiber * servingSize;
        int percentTotalFiber = totalFiber * 100 / drvFiber;
        boolean isTotalFiber = totalFiber < drvFiber;
        
        //protein
        System.out.print("Enter grams of Protein per serving: ");
        int totalProtein = in.nextInt();
        totalProtein = totalProtein * servingSize;
        int percentTotalProtein = totalProtein * 100 / drvProtein;
        boolean isTotalProtein = totalProtein < drvProtein;
        
        //make output variables
        String printCal =     "Calories:            " +     totalCalories + "             " + percentTotalCalories + "             " + isTotalCalories;
        String printFat =     "Fat:                 " +     totalFat +      "             " + percentTotalFat +      "             " + isTotalFat;
        String printCarbs =   "Carbohydrates:       " +     totalCarbs +    "             " + percentTotalCarbs +    "             " + isTotalCarbs;
        String printFiber =   "Dietary Fiber:       " +     totalFiber +    "             " + percentTotalFiber +    "             " + isTotalFiber;
        String printProtein = "Protein:             " +     totalProtein +  "             " + percentTotalProtein +  "             " + isTotalProtein;
        
        //output        
        System.out.println();
        System.out.println();
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);        
        System.out.println();
        System.out.println("Component           Total          Percent          Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(printCal);
        System.out.println(printFat);
        System.out.println(printCarbs);
        System.out.println(printFiber);
        System.out.println(printProtein);
    }//end of main method    
}//end of class
