package logicalPrograms;

import java.util.Iterator;
import java.util.List;

public class PrintLastCharOfStringUsing_Iterator 
{
	public static void main(String[] args) 
	{
		List<String> stringList= List.of("java", "python", "ruby", "");
		PrintLastChar(stringList);
		
	}
	
	public static void PrintLastChar(List<String> stringList)
	{
		Iterator<String> itr = stringList.iterator();
		
		while(itr.hasNext())
		{
			String str = itr.next();
			
			if(!str.isEmpty())
			{
				char lastChar = str.charAt(str.length()-1);
				System.out.println("lastChar of "+str+" is: "+lastChar);
			}
			else
			{
				System.out.println("empty string");
			}
		}
		
	}

}
