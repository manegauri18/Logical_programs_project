package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

public class Ex4_Hashset 
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add("ramesh");
		hs.add("ganesh");
		hs.add("mahesh");
		hs.add("suresh");
		hs.add("ramesh");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		System.out.println("---Print all data using iterator---");
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data using for Each loop---");
		for(Object s1 : hs)
		{
			System.out.println(s1);
		}
		
		
	}

}
