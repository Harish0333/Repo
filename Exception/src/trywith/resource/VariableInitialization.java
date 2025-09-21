package trywith.resource;

public class VariableInitialization 
{
	public static void main(String[] args) 
	{      
	   int x;
       try
       {    	  
    	   x = 12;
    	   System.out.println(x);
       }
       catch(Exception e)
       {    	  
    	   x = 12;  //Variable initialization is compulsory here
    	   System.out.println(x);
       } 
       System.out.println("Main completed!!!");
	}
}
