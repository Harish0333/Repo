/*Write a program to calculate the tax for a taxable income of Rs. 9,90,000, if the tax rate is fixed at 4.9%.
Output:
Taxable Income: Rs. 990000.0
Tax Rate: 4.9%
Tax Amount: Rs. 48510.0*/
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the taxable income
        // Define the tax rate (4.9% as a decimal)
        // Calculate the tax amount
        // Display the tax amount
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter income:");
		double income=sc.nextDouble();
		System.out.print("Enter Tax rate:");
		double rate=sc.nextDouble();
		sc.close();
		double tax=(rate*income)/100;
		System.out.println("Output:");
		System.out.println("Taxable Income: Rs."+income);
		System.out.println("Tax rate: "+rate);
		System.out.println("Tax Amount: Rs."+tax);
	}

}
