package com.task;

class Alpha implements Runnable 
{  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());
  }  
}  
class Beta implements Runnable
{  
  public void run() 
  {  
    new Alpha().run();  
    new Thread(new Alpha(),"Thread 2").run();
    new Thread(new Alpha(),"Thread 3").start();  
   }
}  
public class Test
{  
  public static void main (String[] args) 
  {  
    new Thread(new Beta(),"Thread 1").start();  
  }
}
