package Logical_interview_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class practice_ex 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();

	    // Form a list of strings with duplicates.
	    list.add("0");
	    list.add("1");
	    list.add("2");
	    list.add("3");
	    list.add("4");
	    list.add("5");
	    
	    // Insert a new set of strings with duplicates.
	    list.add("0");
	    list.add("1");
	    list.add("2");

	    System.out.println("Input list: " + list);
	    System.out.println("\nFiltered duplicates: " + processList(list));
	}
	
	public static List<String> processList(List<String> listContainingDuplicates) 
	{

	    Set<String> uniqueSet = new HashSet<>();
	    List<String> filteredList = new ArrayList<>();

	    for (String str : listContainingDuplicates) 
	    {
	      if (uniqueSet.add(str)) 
	      {
	        // If the element was added to the set, it's unique, so add it to the filtered list.
	        filteredList.add(str);
	      }
	    }

	    return filteredList;
	  }

}
