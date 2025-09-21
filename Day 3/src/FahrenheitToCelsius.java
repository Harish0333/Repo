/*Write a program in java to convert from Fahrenheit to Celsius 
Formula is :- celsius=(fahrenheit-32)*5/9;
Output:
Given Temperature in Fahrenheit: 121.0
Temperature in Celsius: 49.44444444444444*/
import java.util.Scanner; 
public class FahrenheitToCelsius 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declare Fahrenheit value
		//Calculate Celsius value using formula
		//Print results
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temparature in fahrenheit:");
		double fah=sc.nextDouble();
		sc.close();
		double celsius=(fah-32)*5/9;
		System.out.println("Given Temperature in Fahrenheit:"+fah);
		System.out.println("Temperature in Celsius:"+celsius);
	}
}
