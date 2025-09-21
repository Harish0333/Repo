package com.task;
import java.util.Arrays;
/** An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly.
Using an anonymous array, we can pass an array with user values without the referenced variable.

Properties of Anonymous Arrays:
-------------------------------
* We can create an array without a name. Such types of nameless arrays are called  anonymous arrays.
* The main purpose of an anonymous array is just for instant use (just for one-time usage).
*An anonymous array is passed as an argument of a method.

Syntax:-
new <data type>[]{<list of values with comma separator>};

 *   int arr1[]=new int[5];
 *   int arr2[]={1,2,3};
 *   int arr3[]=new int[]{1,2,3};
 *   
 *    new int[]{1,2,3};
 *   
 *   
 */

public class AnonymousArray 
{
	public void sum(int x[])
	{
		int sum=0;
		for(int y:x)
		{
			sum+=y;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		/**int []arr= {1,2,3,4};
     	Program01 p=new Program01();
     	p.sum(arr);

		AnonymousArray p=new AnonymousArray();
	   new AnonymousArray().sum(new int[] {1,2,3,4});
	   int []arr= {1,2,3,4};
	   System.out.println(p.hashCode());
	   System.out.println(arr.hashCode());
	   System.out.println(Arrays.hashCode(arr));*/
		
		int []arr= {1,2,3,4};
		int []p= {1,2,3,4};
		System.out.println(p.hashCode());
		System.out.println(arr.hashCode());
		System.out.println("______________");
		System.out.println(Arrays.hashCode(arr));
		System.out.println(Arrays.hashCode(p));
		/*This is because the Object.hashCode() method only considers the reference of the object, 
		 * and the two arrays are different objects.
			The Arrays.hashCode() method is often used in hash tables to quickly find the location of an object. 
			The hash code of an object is used to determine which bucket in the hash table the object will be stored in.
			The Object.hashCode() method is also used in the equals() method to determine if two objects are equal. 
			The equals() method compares the contents of two objects, while the hashCode() method only considers the reference of the object.*/
	}
	
}

