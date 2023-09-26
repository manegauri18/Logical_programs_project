package logicalPrograms;

import java.util.Arrays;

public class FindFourthHighestAndThirdSmallestNumFromArray 
{
	public static void main(String[] args)
	{
		int array[] = { 100,14, 46, 47, 94, 97, 52, 86, 36, 94, 89 };
		
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int fourthLargest = NthLargest(array, 4);
		System.out.println("fourth largest num is: "+fourthLargest);
		
		int secondSmallest = NthSmallest(array, 3);
		System.out.println("second smallest num is: "+secondSmallest);
	}
	
	public static int NthLargest(int array[], int n)
	{
		Arrays.sort(array);
		return array[array.length- n];
	}
	
	public static int NthSmallest(int array[], int n)
	{
		Arrays.sort(array);
		return array[n-1];
	}


}
