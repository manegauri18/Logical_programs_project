package logicalPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class How_to_find_Duplicates_elements_in_array 
{
	public static void main(String[] args) 
	{
		
	        int[] array = {2, 4, 7, 2, 11, 5, 7, 14, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12};
	        List<Integer> distinctDuplicates = findDistinctDuplicates(array);

	        System.out.println("Distinct duplicate items in descending order: " + distinctDuplicates);
    }

	    public static List<Integer> findDistinctDuplicates(int[] array) 
	    {
	        Map<Integer, Integer> mp = new HashMap<>();
	        List<Integer> distinctDuplicates = new ArrayList<>();

	        for (int num : array)
	        {
	            mp.put(num, mp.getOrDefault(num, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
	        {
	            int value = entry.getValue();
	            if (value > 1)
	            {
	                distinctDuplicates.add(entry.getKey());
	            }
	        }

	        Collections.sort(distinctDuplicates, Collections.reverseOrder());

	        return distinctDuplicates;
	    }
	
	}


