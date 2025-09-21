/*Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 

Profit = SP – CP

Loss = CP – SP

Profit percentage = (Profit /Cost Price) x 100

Loss percentage = (Loss / Cost price) x 100*/

import java.util.Scanner;
public class ProfitAndLoss 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Selling price:");
		float sp=sc.nextInt();
		System.out.print("Enter the Cost price:");
		float cp=sc.nextInt();
		sc.close();
		float profit=sp-cp;
		float ppercent=profit/cp;
		System.out.println("Profit percentage:"+profit);
		System.out.println("Profit percentage:"+ppercent*100);
		
		float loss=cp-sp;
		System.out.println("Loss:"+loss);
		float Lpercent=loss/cp;
		System.out.println("Loss Percentage:"+Lpercent*100);
	}

}
