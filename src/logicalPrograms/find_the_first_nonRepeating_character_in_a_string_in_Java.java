package logicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class find_the_first_nonRepeating_character_in_a_string_in_Java 
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");

		String str = scanner.nextLine();

		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i < str.length(); i++)
		{
           char ch = str.charAt(i);

		   mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}

		
		for (int i = 0; i < str.length(); i++) 
		{
            char c = str.charAt(i);

		    if (mp.get(c) == 1) 
		    {

		       System.out.println("The first non-repeating character in " + str + " is " + c);

		       break;
		     }
		}	
	}
}
