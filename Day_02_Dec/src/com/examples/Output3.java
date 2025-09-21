package com.examples;
//Question 3
public class Output3 
{
	 /*public static void main(String [] args)
	    {
	        Count t = new Count();
	        t.count();//Output 0 2 4 6
	    }
	}
class Count extends Count2
	{
	    Count()
	    {

	    }
	}
class Count2
	{
	    void count()
	    {
	        System.out.print("Output = ");

	        for (int x = 0; x < 7; x++,x++ )
	        {
	            System.out.print(" " + x);
	        }
	    }
	    ------------------------------------------------------------------
	    
	public static void main(String s[])
    {
        int i = 2;
        B b = new B();
        b.execute();
    }
}

class A
{
    int i = 0;
    A(){}
}

class B extends A
{
    void execute()
    {
        for(; i < 6; i++)
        
            switch(i)
            {
                case 0:
                System.out.println("i is zero.");
                break;
        
                case 1:
                System.out.println("i is one.");
                break;
        
                case 2:
                System.out.println("i is two.");
                continue;
        
                case 3:
                System.out.println("i is three.");
                break;
        
                default:
                System.out.println("i is greater than three.");
            }
    }
}
-------------------------------------------------------------
	public static void main(String s[])
	{
		int i = 2;
		B b = new B();
		b.execute();
	}
}

	class A
	{
		A()
		{
		int i = 1;
		}
	}

class B extends A
{
	void execute()
	{
		System.out.println("i="+ i);
	}
}
	-------------------------------------------------------------*/
	 public static void main(String[] args) 
	 {
	        new A(3);//6
	        new B(5, 6);
	        new B(6, 7).C(1, 2, 3);
	        new C(3, 3, 4).B(4, 5);
	        new C(1, 1, 1);
	    }
	}
	class A 
	{
	    A(int i) 
	    {  
	    	print(i * 2);   
	     }
	    void print(int i) 
	    { 
	    System.out.print(i + " ");   
	    }
	}
	class B extends A 
	{
	    B(int j, int k) 
	    {
	        super(j);
	        print(k * 4);
	    }
	    void C(int j, int k, int l) 
	    {
	      print(j + k + l - 3);   
	       }
	}
	class C extends B 
	{
	    C(int j, int k, int l) 
	    {
	        super(j, k);
	        print(l - 3);
	    }
	    void B(int i, int k) 
	    {  
	      print(i * 6);   
	      }
}