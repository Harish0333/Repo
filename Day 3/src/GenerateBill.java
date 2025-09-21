/*Write a program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) 
 * and three vegetable puffs (@ Rs 25 per vegetable puffs).There is a special Yoga Day discount of Rs 50 on the final bill amount. 
 * Calculate and print final bill as well as all item bill.
Output:
Itemized Bill:
Cost of Chicken Rolls: Rs 240.0
Cost of Vegitable Puffs: Rs 75.0
Total Bill Before Discount: Rs 315.0
Yoga Day Discount: Rs 50.0
Final Bill after discount: Rs 265.0
*/
import java.util.Scanner;
public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define variables
				//Calculate Bill of Chicken rolls and vegitable puffs			
				//Calculate Final Bill after Yoga day discount			
				//Display Results
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of chicken rolls :");
		double chickenrolls=sc.nextDouble();
		System.out.print("Enter the number of Vegitable Puffs :");
		double VegitablePuffs=sc.nextDouble();
		sc.close();
		double totalbill=(VegitablePuffs*25)+(chickenrolls*60);
		System.out.println("Itemized Bill:");
		System.out.println("Cost of Chicken Rolls:"+chickenrolls*60);
		System.out.println("Cost of Vegitable Puffs:"+VegitablePuffs*25);
		System.out.println("Total Bill Before Discount:"+totalbill);
		double discount=50;
		System.out.println("Yoga Day Discount:"+discount);
		double finalbill=totalbill-discount;
		System.out.println("Final Bill after discount:"+finalbill);
		
	}

}
