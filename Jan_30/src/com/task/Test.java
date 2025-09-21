package com.task;
class A implements Runnable 
{  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());
  }  
}  
class B implements Runnable
{  
  public void run() 
  {  
    new A().run();//t1
    new Thread(new A(),"T2").run();  
    new Thread(new A(),"T3").start();  
   }
}  
public class Test
{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}