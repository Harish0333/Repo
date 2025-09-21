package com.task6;

public class FI 
{
	public static void main(String[] args){
	     int a = 25;
	     int b = 5;  
	     int add = NIT.add(a,b);
	     int sub = NIT.sub(a,b);
	     int mul = NIT.multiply(a,b);
	     int div = NIT.divide(a,b);
	     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
	      
	     NIT sq = (x) -> 
	     {
	    	 return x*x;
	     };
	     System.out.print(sq.square(6));
	 }
}
