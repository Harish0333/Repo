package com.nit;

public class Sample 
{
	private Integer i1 = 900;

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		
		System.out.println(s1);
		
		Sample s2 = new Sample();       

		System.out.println(s2);
	    Sample s3 = modify(s2); //null


		System.out.println(s3);
		s1 = null;

        //GC [4 objects are eligible for GC i.e 1000x, 2000x, 5000x and 6000x]

		System.out.println(s2.i1);		//900
	}
    public static Sample modify(Sample s)
	{
		System.out.println(s.i1);//900
		s.i1=8;//9
		s = new Sample();
		s.i1= 20; //900	//20 
        		System.out.println(s.i1);//20
		s=null;//null
		return s;
	}

}
