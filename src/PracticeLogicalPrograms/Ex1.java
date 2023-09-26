package PracticeLogicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex1 
{
	public static void main(String[] args)
	{
	   Scanner scan	= new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   
	  String s1 = scan.nextLine();
	  
	  Map<Character, Integer> mp = new HashMap<>();
	  
	  for(int i=0; i<s1.length(); i++)
	  {
		  char ch = s1.charAt(i);
		  
		  mp.put(ch, mp.getOrDefault(ch, 0)+1);
	  }
	  
	  
	  for(int i=0; i<s1.length(); i++)
	  {
		  char ch = s1.charAt(i);
		  
		if(mp.get(ch)==1)
		{
			System.out.println(ch);
			break;
		}
			
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}	
}
