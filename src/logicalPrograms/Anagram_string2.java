package logicalPrograms;

import java.util.Arrays;

public class Anagram_string2
{
	public static void main(String[] args) 
	{
		String s1="HE Is aRAdHYA";
		String s2="is he HRADAYA";
		
		s1= s1.replace(" ", "");
		s2= s2.replace(" ", "");
		
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("Strings are anagram");
		}
		
		else
		{
			System.out.println("Strings are not anagram");
		}
		
	}

}
