import java.util.Scanner;
public class CompoundInterestCalculator 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		////create Scanner object and read rate of interest and principal amount from the user
        //close scanner
        //calculate compound interest based on formula
        // display compound interest
        
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Principal amount:");
		float principle=sc.nextFloat();
		System.out.print("Enter the annual rate of Interest:");
		float rate=sc.nextFloat();
		sc.close();
		float a=(1+rate/100);
		float amount = principle*(a*a*a);
		float Compinterest = amount-principle;
		System.out.print("The compound interest after 3 years is:"+Compinterest);
    
	}

}
