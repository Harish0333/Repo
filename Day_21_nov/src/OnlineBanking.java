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
1. Name of method : setDeatils
Arguments : 6 parameters
Access modifier : public
 
[bankName,bankCustomerName,bankAddress,bankIFSCCode,customerAccountNumber,c
urrentBalance]
 Return Type : void
Access Modifiers: public
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
 [which will return the deatil of the customer to the displayDetail()]
------------------------------------------------
ELC Class
-------------------------------------------------
An ELC class BankCustomer is given to you, call the method and perform the Operation
[Input you have to take from the Scanner class*/
import java.util.Scanner;
public class OnlineBanking 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		 Bank bank = new Bank();
		 
	        System.out.println("Enter Bank Name:");
	        String bankName = sc.nextLine();

	        System.out.println("Enter Customer Name:");
	        String customerName = sc.nextLine();

	        System.out.println("Enter Bank Address:");
	        String bankAddress = sc.nextLine();

	        System.out.println("Enter IFSC Code:");
	        String bankIFSCCode = sc.nextLine();

	        System.out.println("Enter Account Number:");
	        int accountNumber = sc.nextInt();

	        System.out.println("Enter Initial Balance:");
	        int initialBalance = sc.nextInt();

	        bank.setDetails(bankName,customerName,bankAddress,bankIFSCCode,accountNumber,initialBalance);
	        System.out.println("Enter 1 to Withdraw, 2 to Deposit, 3 to Display Details, 4 to Exit:");
	        int choice = sc.nextInt();

	        while (choice != 4) 
	        {
	            switch (choice) 
	            {
	                case 1:
	                    System.out.println("Enter Withdrawal Amount:");
	                    double withdrawAmount = sc.nextDouble();
	                    bank.withdraw(withdrawAmount);
	                    break;
	                case 2:
	                    System.out.println("Enter Deposit Amount:");
	                    double depositAmount = sc.nextDouble();
	                    bank.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.println(bank.displayDetails());
	                    break;
	                default:
	                    System.out.println("Invalid Choice");
	            }
	            System.out.println("Enter 1 to Withdraw, 2 to Deposit, 3 to Display Details, 4 to Exit:");
	            choice = sc.nextInt();
	            sc.close();
	        }
	        System.out.println("Thank you for using the Bank application!");
	}
}
