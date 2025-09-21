package com.task.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) throws IOException, Exception  
	{
		ArrayList<product> productList = new ArrayList<>();
		productList.add(new product(1, "Laptop", 55000.99));
		productList.add(new product(2, "Smartphone", 9000.50));
        productList.add(new product(3, "Headphones", 999.00));
        productList.add(new product(4, "Mouse", 299.80));
        productList.add(new product(5, "Keyboard", 499.99));
        
        var foos=new FileOutputStream("C:\\Users\\Harish\\eclipse-workspace\\Feb_12_ClassAssignment\\product.txt");
    	var oos=new ObjectOutputStream(foos);
    	
        try(oos;foos;) //serialization
        {
        	oos.writeObject(productList);	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        var fin = new FileInputStream("C:\\Users\\Harish\\eclipse-workspace\\Feb_12_ClassAssignment\\product.txt");
		var ois = new ObjectInputStream(fin);
		try(fin;ois)
		{			
	        @SuppressWarnings("unchecked")
			ArrayList<product> productlist = (ArrayList<product>)ois.readObject();
	        productlist.forEach(System.out::println);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
          

	}

}
