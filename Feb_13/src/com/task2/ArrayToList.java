package com.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList 
{
	public static List<String> convertToList(String[] inputArray)
	{
		if(inputArray==null || inputArray.length==0)
		{
			return new ArrayList<>();
		}
		else
		{
			return Arrays.asList(inputArray);
		}
	}
}
