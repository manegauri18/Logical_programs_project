package logicalPrograms;

import java.util.Arrays;

public class PrintElementsOfArrayPresentOnOddPosition 
{
	public static void main(String[] args) 
	{
		 int [] array = new int [] {25, 11, 7, 75, 56}; 
		 
		 int thirdLargest = thirdLargest(array, 3);
		 System.out.println("thirdLargest: "+thirdLargest);
		 
		int secondSmallest = secSmallest(array,2);
		System.out.println("secondSmallest: "+secondSmallest);
		 
	}
		 
		 
	public static int thirdLargest(int[]array, int n)
	{
		Arrays.sort(array);
		return array[array.length-n];
	}
	
	public static int secSmallest(int[]array, int n)
	{
		Arrays.sort(array);
		return array[n-1];
	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
	

