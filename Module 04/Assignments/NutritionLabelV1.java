
/**
 * The purpose of this program is to ......
 * 
 * ©FLVS 2007
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NutritionLabelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyValueGramsTotalFat = 65;           //fat DRV    
        int dailyValueTotalCarbs = ;             //carbohydrates DRV       
        int dailyValueFiber = ;                   //fiber DRV
                                                  //protein DRV
  
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = 
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        
        
        //carbs
        System.out.print("Enter grams Carbohydrate per serving: ");
        
        
        //fiber
        
        
        //protein
        
        
        //output
        
        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        
        System.out.println();
        System.out.println("Component           Total          Percent          Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Calories              " + totalCalories + "             " + percentTotalCalories + "          " + isTotalCalories);
       
        
       

       
        
        
    }//end of main method    
}//end of class
