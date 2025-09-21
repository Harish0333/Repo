package com.task;

public class AnonymousArray2 
{
	public void print(Integer arr[]) 
	{
		 for(Integer var: arr) 
		 {
			  System.out.print(var+" ");
		 }
	}
	public void print(String arr[]) 
	{
		 for(String var: arr) 
		 {
			  System.out.print(var+" ");
		 }
	}/*
 public void print(Object ob[]) 
 {
	  for(Object o:ob) 
	  {
		   System.out.println(o+" ");
	  }
}*/
 public static void main(String[] args) 
	{
	 	AnonymousArray2 p=new AnonymousArray2();
		Integer arr[]= {1,2,3,4};
		String str[]= {"Mahi","chiku","Hitman"};
		p.print(arr);
		p.print(str);
		new AnonymousArray2().print(new Integer[] {1,2,3});
		new AnonymousArray2().print(new String[] {"Mahi","chiku","Hitman"});

	}
}
