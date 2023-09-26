package Practice_logicalPattern_programs;

import java.util.Iterator;

public class demo7 
{
	public static void main(String[] args)
	{
		String s="I am learning java";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println("Reverse string is: "+rev);
		
		if (s.equals(rev)) 
		{
			System.out.println("String is palindrome");
		} 
		else
		{
            System.out.println("String is not palindrome");
		}
		
		
		
		
	}

}
