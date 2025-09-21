package com.task3;
/*Program: 3
----------------
Write a java program to find duplicates in an arrayList.
A BLC class Duplicates is given to you. 
Add the following implementations in the class:
1. A List attribute called numberList. This must be a list of Integers
2. Getter/Setter for the list
3. Implement the No Argument constructor.
   Implement the parameter constructor.
   Implement the method getDuplicatesList():
4. This method must scan through the numberList field of the class. 
   All the numbers in the list that are duplicated
   (occurs more than once) must be returned as a new List. 
For example, if the numberList is initialized to 
{33,45,67,89,33,47,21,45},
the method should return a new list that contains { 33,45}.
 Note that a number may be repeated any number of times in the 
list, but it should be present in the returned list only once. 
 For example, if the numberList is initialized to { 66,66,77,66,66}, 
the method should return a new list that contains { 66}.
5. If the numberList is empty, or null, return null.*/
import java.util.ArrayList;
import java.util.List;

public class Duplicates 
{
	private List<Integer> numberList;

	public Duplicates() 
	{
		super();
		this.numberList = new ArrayList<>();
	}
	
	public Duplicates(List<Integer> numberList) 
	{
		super();
		this.numberList = numberList;
	}
	protected List<Integer> getNumberList() 
	{
		return numberList;
	}

	protected void setNumberList(List<Integer> numberList) 
	{
		this.numberList = numberList;
	}

	public List<Integer> getDuplicatesList()
	{
		if (numberList == null || numberList.isEmpty()) 
		{
            return null;
        }

        List<Integer> duplicates = new ArrayList<>();
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numberList) 
        {
            if (uniqueNumbers.contains(number) && !duplicates.contains(number)) 
            {
                duplicates.add(number);
            } 
            else 
            {
                uniqueNumbers.add(number);
            }
        }

        return duplicates;
	}
	public static void main(String []args)
	{
		List<Integer> numbers = new ArrayList<>();
		numbers.add(33);
		numbers.add(45);
        numbers.add(67);
        numbers.add(89);
        numbers.add(33);
        numbers.add(47);
        numbers.add(21);
        numbers.add(45);
        
        System.out.println("Original numbers :"+numbers);
        Duplicates duplicate=new Duplicates(numbers);
        List<Integer> duplicatesList = duplicate.getDuplicatesList();
        System.out.println("Duplicate numbers: " + duplicatesList);
        
      
	}
}
