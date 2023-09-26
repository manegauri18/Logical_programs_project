package Practice_logicalPattern_programs;

import java.util.Arrays;

public class Anagram_strings 
{
	public static void main(String[] args) 
	{
		String s1="SILENT";
		String s2="LISTEN";
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
	       boolean result = Arrays.equals(a,b);
	       
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
