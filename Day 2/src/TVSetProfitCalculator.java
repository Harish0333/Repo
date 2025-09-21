/*
 * A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. 
 * Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. 
 * Display total selling price, profit along with vat and service charge.
Output:
Cost Price: Rs. 32500.0
Profit: Rs. 8775.0
VAT: Rs. 5241.925
Service Charge: Rs. 1597.3425
Total Selling Price: Rs. 48114.2675*/
import java.util.Scanner;
public class TVSetProfitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define all the variables provided in question
        // Calculate the profit amount
        // Calculate the selling price before VAT and service charge
        // Calculate the VAT amount
        // Calculate the service charge amount
        // Calculate the total selling price including VAT and service charge
        // Display the results
		 	Scanner sc=new Scanner(System.in);
	        System.out.println("Enter cost price:");
			double price=sc.nextDouble();
	        System.out.println("Enter profit percentage:");
			double pp=sc.nextDouble();

	        System.out.println("Enter VAT percentage");
			double VATp=sc.nextDouble();
	        System.out.println("Enter service charge percantage:");
			double Servicep=sc.nextDouble();
			sc.close();
			System.out.println("Cost price:"+price);
			double profit=(price*pp)/100;
			System.out.println("Profit:"+profit);
			double vat=(VATp*(profit+price))/100;
			System.out.println("VAT:"+vat);
			double service=(Servicep*(profit+price))/100;
			System.out.println("Service:"+service);
			double Total=profit+vat+service+price;
			System.out.println("Total selling Price:"+Total);
	}

}
