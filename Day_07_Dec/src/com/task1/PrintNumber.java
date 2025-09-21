package com.task1;
/*Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods 
 * with the same name 'printn' having a parameter for each datatype.

Expected Output:
In integer 3
In long 33223222332
In double 323233.44
In float 33344.5
In Char A
In String Overloading
*/
public class PrintNumber 
{
		//write print() method for int
		//write print() method for long
		//write print() method for float
		//write print() method for double
		//write print() method for char
		//write print() method for String
	public int print(int x)
	{
	    System.out.println("Integer :"+x);
	    return x;
	}
	//write print() method for int
public long print(long x)
	{
	    System.out.println("long :"+x);
	    return x;
	}
	//write print() method for long
public float print(float x)
	{
	    System.out.println("float :"+x);
	    return x;
	}
	//write print() method for float
public double print(double x)
	{
	    System.out.println("double :"+x);
	    return x;
	}
	//write print() method for double
public char print(char x)
	{
	    System.out.println("char   :"+x);
	    return x;
	}
	//write print() method for char
public  String print( String x)
	{
	    System.out.println("String :"+x);
	    return x;
	}
		public static void main(String[] args)
		{
			//create an object to PrintNumber class
	          new  PrintNumber().print(5);
			//call print() method by passing int value 
	            new  PrintNumber().print(28787699L);
			//call print() method by passing long value 
	             new  PrintNumber().print(28787.699D);
			//call print() method by passing double value 
	 new  PrintNumber().print(87.0980809699F);
			//call print() method by passing float value 
	 new  PrintNumber().print('C');
			//call print() method by passing char value 
	 new  PrintNumber().print("Harish");
			//call print() method by passing String value  
		}
}
