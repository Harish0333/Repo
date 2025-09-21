package com.task1;
/*Que-) What is an Array?

ANS:-> An array is a collection of homogeneous type of element. It can hold multiple values of same type. 
       In Java due to upcasting concept, array can also hold hetrogeneous types of data.

Example :-
--------------
Object [] obj = {12,"Prashant",null, 90.56};   //Hetrogeneous*/
public class HetrogenousElement {
public static void main(String[] args) 
{		
        Object ob[]=new Object[4]; 
        ob[0]=12;
        ob[1]="prashant";
        ob[2]=null;
        ob[3]=97.6;
    
    System.out.println("Element at ob[0]:-"+ob[0]);
	System.out.println("Element at ob[1]:-"+ob[1]);
	System.out.println("Element at ob[2]:-"+ob[2]);
	System.out.println("Element at ob[3]:-"+ob[3]);
	}
}
