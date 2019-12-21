/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * 
 * 
 * Edited by: Zachary Gill
 * 10-23-2012
 */
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 12.15;          // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        
        //remaining variables below here
        double yenSpent = 99939.75;
        double yenExchangeRate = 75.59;
        double dollarsSpentInJapan = 0.0;
        double euroSpent = 624.95;
        double euroExchangeRate = 0.73;
        double dollarsSpentInEurope = 0.0;

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
        // code goes below here
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        remainingUsDollars = startingUsDollars - dollarsSpentInMexico;

        // convertion for Japanese yen
        // code goes below here
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        remainingUsDollars = remainingUsDollars - dollarsSpentInJapan;

        // convertion for Euros
        // code goes below here
        dollarsSpentInEurope = euroSpent / euroExchangeRate;
        remainingUsDollars = remainingUsDollars - dollarsSpentInEurope;

        //print output to the screen
        // code goes below here
        System.out.println("====================================================");
        System.out.println("Starting US dollars:           " + startingUsDollars);
        System.out.println("US dollars spent in Mexico:    " + dollarsSpentInMexico);
        System.out.println("US dollars spent in Japan:     " + dollarsSpentInJapan);
        System.out.println("US dollars spent in France:    " + dollarsSpentInEurope);
        System.out.println("Remaining US dollars:          " + remainingUsDollars);
        System.out.println("====================================================");
        System.out.println();


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = budget1 / costItem1; 		//how many items can be purchased
		double fundsRemaining1 = (double) budget1 - ((double) costItem1 * (double) totalItem1);  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  (int) fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		double totalItem2 = (double) budget2 / (double) costItem2; 	//how many items can be purchased
		int totalItem2x = (int) totalItem2;
		double fundsRemaining2 = (double) budget2 - ((double) costItem2 * (double) totalItem2x);  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2x);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

