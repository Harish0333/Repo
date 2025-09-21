package com.task;
import java.util.Arrays;
import java.util.Scanner;
/*       input:-   { 1 , 2 , 3 , 4  , 5}
 *                 choice= 3
 *                 
 *                 for(int i=0;i<Arr.len;i++)
 *                    {
 *                       if( arr[i]>=choice){
 *                       newArr[i]=a
 *                       }
 *                       }
 *                for(int i=0;i<Arr.len;i++){
 *                    if( arr[i]<choice)       
                  
 *       output:-     {4,5,1,2,3}
 */
/*create an array of integer allow user to copy the 
*   element from old array to the new array as well 
*   as user want to modify the array size to insert 
*   more element in new array so your code should
*   also allow this modification and return the 
*   new array through a method.
*   */
public class Program04 
{
	public static int[] modify(int arr[],int ele) 
	{
		int newArr[]=Arrays.copyOf(arr, arr.length+ele);
		int index=arr.length;
		newArr[index++]=5;
		newArr[index]=8;
		
		return newArr;
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int arr1[]= {1,2,3,4};
	System.out.println("How many extra ele you want to insert");
	
	int ele=sc.nextInt();
	 int result[]=Program04.modify(arr1,ele);
	 System.out.println(Arrays.toString(result));
	 sc.close();
	}
}
