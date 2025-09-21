/*A BLC class named as Bank is given in which you need to write the code for performing 
the withdrawal and deposit process and also Checking current balance and displayDetail of 
the customer (BlC class)
Instance variable
bankName:String, private
bankCustomerName:String, private
bankAddress:String, private
bankIFSCCode:Stirng, private
customerAccountNumber:int, private
currentBalance:int, private
---------------------------------------------------
This BLC class will contain 6 method with the following specifications :-
---------------------------------------------------
1. Name of method : setDetails
Arguments : 6 parameters
Access modifier : public
[bankName,bankCustomerName,bankAddress,bankIFSCCode,customerAccountNumber,c
urrentBalance]
Return Type : void
---------------------------------------------------
2. Name of method : withdraw
Arguments : double amount
Return Type : void
Access Modifiers: public
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
If current balance is Rs.1000 or below, then print InsufficientBalance from the method.
While withdrawing, if the remaining current balance goes less than Rs.1000, then print 
Maintain MinimumBalance message from the method.
While withdrawing, if the remaining current balance is Rs.1000 or above, then print in the 
following manner from the method:-
Transaction Successful.
Available Balance : Rs.1000.0
--------------------------------------------------
3. Name of method : deposit
Arguments : double amount
Return Type : void
Access Modifiers: public 
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
After deposit from here only call the CurrentBalance Method which will show the Updated 
BALANCE in the following manner from the method:-
For Example : you are trying to deposit 2000 rs in your account and current balance is 
1000 so the output should be 
 Deposited Successfully .
 Available Balance : Rs.3000.0
--------------------------------------------------
4. Name of method : CurrentBalance
Arguments : No Argument
Return Type : void
Access Modifiers: public
This Method print the Current balance
-------------------------------------------------
5. Name of method : displayDetails
Arguments : No Argument
Return Type : String
Access Modifiers: public
 [This method will call the toString method and this method will return 
 the detail through toString() to the User]
-------------------------------------------------
6. override toString()
 [which will return the detail of the customer to the displayDetail()]*/
public class Bank 
{
	private String bankName;
	private String bankCustomerName; 
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;
	
	public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, int customerAccountNumber, int currentBalance) 
	{
	this.bankName=bankName;
	this.bankCustomerName=bankCustomerName;
	this.bankAddress=bankAddress;
	this.bankIFSCCode=bankIFSCCode;
	this.currentBalance=currentBalance;
	this.customerAccountNumber=customerAccountNumber;
	}
	
	public void withdraw(double amount) 
	{
		if(currentBalance<=1000)
		{
			System.out.println("InsufficientBalance...");
		}
		else
		{
			currentBalance-=amount;
			if(currentBalance<1000)
			{
				System.out.println("Maintain MinimumBalance...");
				//currentBalance += amount;
			}
			else
			{
				System.out.println("Transaction Successful...");
				currentBalance();
			}
		}
	}
	public void deposit(double amount) 
	{
		currentBalance += amount;
		System.out.println("Deposited Successfully...");
		currentBalance();		
	}
	public void currentBalance() 
	{
		System.out.println("Available Balance : Rs."+currentBalance);
		
	}
	public String displayDetails() {
		
		return toString();
	}

	@Override
	public String toString()
	{
		return "Bank [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress
				+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
}
