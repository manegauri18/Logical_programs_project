package Practice_logicalPattern_programs;

import java.util.Arrays;

public class demo1 
{
	public static void main(String[] args)
	{
		String s1="HE Is ARadHYa";
		String s2="IS HE HrAdAYA";
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}

	}

}
