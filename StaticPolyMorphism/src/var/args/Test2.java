package var.args;

public class Test2 {
	   public void acceptData(int ...x)
	   {
		   int sum = 0;
		   
		   for(int y : x)
		   {
			   sum = sum + y;
		   }
		   System.out.println("Sum of Parameter :"+sum);
	   }

}
