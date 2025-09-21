/*
 Create a java program for a bakery shop that takes user input for an item's name, quantity, and price, 
 calculates the total cost, and then generates an invoice? The program should welcome the user, 
 collect this information, display the invoice with the item details, quantity, price per item, 
 and the total cost, and finally thank the user for shopping at the bakery shop.
------ Invoice ------
Item: Croissant
Quantity: 3
Price per item: Rs.2.50
Total cost: Rs.7.50
Thank you for shopping at My Bakery Shop! Have a nice day!
*/
import java.util.Scanner;
public class Bakery_shop 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("-------------Welcome to bakery shop------------");
		Scanner sc=new Scanner(System.in);
		System.out.print("Item:");
		String str="";
		str=sc.next();
		
		System.out.print("Quantity:");
		int q=sc.nextInt();
		System.out.print("Price per item:");
		float p=sc.nextFloat();
		sc.close();
		float tc=q*p;
		
		System.out.println("-------------------Invoice--------------------");
		
		System.out.println("Item:"+str);
		System.out.println("Quantity:"+q);
		System.out.println("Price per item:"+p);
		System.out.println("Total cost:"+tc);
		System.out.println("Thank you for shopping at My Bakery Shop! Have a nice day!");
	}

}
