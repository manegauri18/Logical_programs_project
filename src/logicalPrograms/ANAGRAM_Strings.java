package logicalPrograms;

import java.util.Arrays;

public class ANAGRAM_Strings 
{
	public static void main(String[] args) 
	{
		String s1="LISTEN";
		String s2="SILENT";
		
		 char[] a = s1.toCharArray();
		 char[] b = s2.toCharArray();
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 boolean result = Arrays.equals(a, b);
		 
		 if(result==true)
		 {
			 System.out.println("Strings are anagram of each other");
		 }
		 else
		 {
			 System.out.println("Strings are not anagram");
		 }
		
	}

}
