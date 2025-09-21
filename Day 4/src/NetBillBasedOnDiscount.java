/*A whole-seller gives incentives in the form of discounts on the net bill. 
 * Write a program to input the net bill and calculate the discount as follows:
   Net Bill in Rupees			  Discount %
	<5000							5
	>=5000 and <10000				10
	>=10000							15
Display Discount %, Discount Amount and Amount Payable
Output:
Enter Net Bill 8000
Discount Percentage: 10.0
Discount Amount: 800.0
Amount Payable: 7200.0*/
import java.util.Scanner;
public class NetBillBasedOnDiscount 
{
	public static void main(String[] args) 
	{
				// TODO Auto-generated method stub
				// Create a Scanner object to read user input	
				// Prompt the user to enter the amount of Net Bill			
				// Find discount percentage based on conditions			
				//Calculate Discount amount			
				//Calculate Amount Payable			
				//Display results
				//close Scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Net Bill :");
		int bill= sc.nextInt();
		sc.close();
		double discount,amount,total;
		if(bill<5000)
		{
			discount=5;
			amount=(bill*discount)/100;
			total=bill-amount;
			System.out.println("Discount percentage: "+discount);
			System.out.println("Discount Amount : Rs "+amount);
			System.out.println("Amount Payable Rs:"+total);
		}
		else if(bill>5000 && bill<10000)
		{
			discount=10;
			amount=(bill*discount)/100;
			total=bill-amount;
			System.out.println("Discount percentage: "+discount);
			System.out.println("Discount Amount: Rs "+amount);
			System.out.println("Amount Payable: Rs"+total);
		}
		else
		{
			discount=15;
			amount=(bill*discount)/100;
			total=bill-amount;
			System.out.println("Discount percentage: "+discount);
			System.out.println("Discount Amount: Rs "+amount);
			System.out.println("Amount Payable: Rs"+total);
		}
	}

}
