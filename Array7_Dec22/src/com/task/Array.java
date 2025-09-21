package com.task;
import java.util.Arrays;
/*Given an array of integers of odd length, return a new array length 3 containing 
the elements from the middle of the array.One element should be before middle and 
another one should be after middle. The original array length will be at least 3.*/
public class Array 
{
	public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = getMiddleElements(array);
        
        // Display the result
        System.out.println("Middle Elements: " + Arrays.toString(result));
    }

    public static int[] getMiddleElements(int[] array) {
        // Ensure the array has an odd length and at least 3 elements
        if (array.length < 3 || array.length % 2 == 0) 
        {
          return null;
        }

        else
        {
        int middleIndex = array.length / 2;

        // Create a new array containing the elements before, at, and after the middle
        int[] result = {array[middleIndex - 1], array[middleIndex], array[middleIndex + 1]};

        return result;
        }
    }
}
