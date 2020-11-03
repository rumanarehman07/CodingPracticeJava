package codingPractice.HackerRank;

import java.util.*;

/*Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 
*/
public class TotalCost {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip = meal_cost*tip_percent/100; //calculating tip
    	double tax = meal_cost*tax_percent/100; //calculate tax
    	int total = (int) Math.round(meal_cost + tip + tax); //calculate total price
    	System.out.println(total);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter the meal price ");
        double meal_cost = scanner.nextDouble();
      
        System.out.println("Enter the tip percent ");
        int tip_percent = scanner.nextInt();
     
        System.out.println("Enter the tax percent ");
        int tax_percent = scanner.nextInt();
        
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

