package string.literal;

public class PerformanceComparison {

	public static void main(String[] args) {
		long startTime =  System.currentTimeMillis();  
		   
	    for(int i=1; i<=10; i++)
	    {
	      StringBuffer sb = new StringBuffer(" Java ");
	      sb.append(" technology ");
	      System.out.println(sb);
	    }
	    
	    long endTime =  System.currentTimeMillis();
	    
	    System.out.println("The total time taken by StringBuffer class to execute this loop :"+(endTime-startTime)+" ms");
	    
	    System.out.println(".......................");
	    startTime =  System.currentTimeMillis();  
		   
	    for(int i=1; i<=10; i++)
	    {
	      StringBuilder sb = new StringBuilder(" Java ");
	      sb.append(" technology ");
	      System.out.println(sb);
	    }
	    
	    endTime =  System.currentTimeMillis();
	    
	    System.out.println("The total time taken by StringBuilder class to execute this loop :"+(endTime-startTime)+" ms");
// TODO Auto-generated method stub

	}

}
