package anonymous.approach;
public class Banking 
{
   private double balance = 5000;
   private double withdrawAmount;
   
   public Banking(double withdrawAmount)
   {
	   this.withdrawAmount = withdrawAmount;
   }
   
   public static void main(String[] args)
   {
	   Banking b = new Banking(5000);
	   
	   Runnable r1 = ()->
	   {
		   String name = null;
		   if(b.balance >= b.withdrawAmount)
		   {
			   name = Thread.currentThread().getName();
			   System.out.println(b.withdrawAmount+" Amount withdrawn by :"+name);
			   b.balance = b.balance - b.withdrawAmount;			   
		   }
		   else
		   {
			   name = Thread.currentThread().getName();
			   System.out.println("Sorry "+ name +" Balance is insufficiant");
		   }	
		   System.out.println("Your Account balance is :"+b.balance);
	   };	   
	   
	  Thread t1 = new Thread(r1,"Virat");
	  Thread t2 = new Thread(r1,"Rohit");
	   
	   t1.start(); t2.start();   
   }
}

