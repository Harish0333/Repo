package com.Program3;
/* Program 03 
   ----------
    Create a class BankAccount with instance variables balance and interestRate. Implement an instance block that initializes 
    the instance variable interestRate to 0.01. Implement a constructor that sets the instance variable balance. 
    Implement an instance method deposit(amount) that adds amount to the balance. Implement another instance method withdraw(amount) 
    that subtracts amount from the balance. Implement an instance method calculateInterest() that returns 
    the interest earned on the balance based on the interestRate. Create a BankAccount object with a balance of 1000 and call the 
    deposit(), withdraw(), and calculateInterest() methods on it.*/
public class BankAccount 
{
	double balance ;
	double interestRate;
	
	{
		interestRate =0.01;
	}
	
	public BankAccount(double balance) 
	{
		super();
		this.balance = balance;
	}
	
	public double deposit(double amount)
	{
		balance+=amount;
		return balance;
	}
	public double withdraw(double amount)
	{
		balance-=amount;
		return balance;
	}
	public void calculateInterest() 
	{
		System.out.println(balance*interestRate);		
	}
	public static void main(String[] args)
	{
		BankAccount b1=new BankAccount(1000);//default balance
		double x=387.0;
		System.out.println("Balance amount after deposit of Amount:"+b1.balance+" rupees in the bank account is = "+b1.deposit(2500));
		b1.withdraw(x);
		System.out.println("Balance amount after withdraw of "+x+" rupees from the bank account is = "+b1.balance);
		System.out.println("Interest earned on balance amount is:"+(b1.interestRate*b1.balance));
		System.out.println("Thank you...!!!");
	}
}
