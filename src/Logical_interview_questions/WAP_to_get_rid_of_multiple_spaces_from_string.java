package Logical_interview_questions;

import java.util.StringTokenizer;

public class WAP_to_get_rid_of_multiple_spaces_from_string 
{
	public static void main(String[] args) 
	{
		String input = "Try    to    remove   extra   spaces.";
		
	    StringTokenizer substr = new StringTokenizer(input, " "); //StringTokenizer class is used to break the input string into tokens (substrings).
	                                                              //This means that input string will be split into tokens wherever there is a space character.
	   
	    StringBuffer sb = new StringBuffer();   //StringBuffer is used here bkz it allows you to efficiently build strings by appending pieces together. 

	    while (substr.hasMoreElements())              
	    {
	      sb.append(substr.nextElement()).append(" ");  //This loop iterates through the tokens obtained from the StringTokenizer. 
	                                                   //The hasMoreElements() method checks if there are more tokens to process. 
	                                                 //If there are, it appends the next token (obtained with nextElement()) to the StringBuffer sb, followed by a single space character " "
	    }

	    System.out.println("Actual string: " + input);
	    System.out.println("Processed string: " + sb.toString().trim());
		
		
		
		
		//approach1 below-->
//        String cleanedString = input.replaceAll("\\s+", " ");
//        
//        System.out.println(cleanedString);
		
	}

}
