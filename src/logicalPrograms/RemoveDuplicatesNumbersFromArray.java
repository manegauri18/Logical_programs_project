package logicalPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesNumbersFromArray 
{
	public static void main(String[] args) 
	{
		int[] numbers = {5,12,7,5,8,12};
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		for(int s1 : numbers)
		{
			uniqueNumbers.add(s1);
		}
		
		System.out.println(uniqueNumbers);
		
		
	}

}
