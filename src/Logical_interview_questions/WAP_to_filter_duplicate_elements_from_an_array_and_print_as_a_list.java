package Logical_interview_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WAP_to_filter_duplicate_elements_from_an_array_and_print_as_a_list 
{
	public static void main(String[] args) 
	{
		int[] ar = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
		
		Set<Integer> hs= new HashSet<>();
		
		for(int s1 : ar)
		{
			hs.add(s1);
		}
		
		System.out.print("resulting array: "+hs);
		System.out.println();
		
		//to store them as a list 
		List<Integer> al = new ArrayList<>(hs);
		
		// Print the list of unique elements
        System.out.println("List of unique elements:");
        
        for(Integer s2: al)
        {
        	System.out.println(s2);
        }
		
		
	}

}
