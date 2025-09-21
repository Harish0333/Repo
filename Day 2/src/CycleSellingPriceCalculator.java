/*Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring 
 * and added new accessories worth Rs. 500. Rohan wants to make a profit of Rs. 1500 on selling the cycle. 
 * Find the selling price of the cycle. Write a java program to store all values and calculate and display the selling price.
Output:
Initial Cost: Rs. 1200.0
Repair Cost: Rs. 250.0
Coloring Cost: Rs. 350.0
Accessories Cost: Rs. 500.0
Total Cost: Rs. 2300.0
Desired Profit: Rs. 1500.0
Selling Price: Rs. 3800.0
*/
import java.util.Scanner;
public class CycleSellingPriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define all the variables
        // Calculate the total cost
        // Calculate the selling price to make the desired profit
        // Display the results
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Initial cost: Rs.");
		float iprice=sc.nextFloat();
		System.out.print("Enter Repair cost: Rs.");
		float rprice=sc.nextFloat();
		System.out.print("Enter Coloring cost: Rs.");
		float cprice=sc.nextFloat();
		System.out.print("Enter Accessories cost: Rs.");
		float aprice=sc.nextFloat();
		float tprice=iprice+rprice+cprice+aprice;
		System.out.println("Total cost: Rs."+tprice);
		System.out.print("Enter Desired Profit: Rs.");
		float dprice=sc.nextFloat();
		sc.close();
		float sprice=tprice+dprice;
		
		System.out.println("Output:");
		System.out.println("Initial cost: Rs."+iprice);
		System.out.println("Repair cost: Rs."+rprice);
		System.out.println("Coloring cost: Rs."+cprice);
		System.out.println("Accessories cost: Rs."+aprice);
		System.out.println("Total cost: Rs."+tprice);
		System.out.println("Desired Profit: Rs."+dprice);
		System.out.println("Selling Price: Rs."+sprice);
	}

}
