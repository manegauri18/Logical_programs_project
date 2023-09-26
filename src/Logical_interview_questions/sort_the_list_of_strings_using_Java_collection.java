package Logical_interview_questions;

import java.util.Arrays;

public class sort_the_list_of_strings_using_Java_collection 
{
	public static void main(String[] args) 
	{
		String[] inputList = {
	            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
	            "Jul", "aug", "Sep", "Oct", "nov", "Dec"
	        };

	        // Sort the array (case-insensitive)
	        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
	        

	        // Print the sorted array
	        System.out.println("Sorted List of Months:");
	        
	        for (String month : inputList)
	        {
	            System.out.println(month);
	        }
		
	}

}
