package COLLECTION;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex3_TreeSet 
{
	public static void main(String[] args)
	{
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("gauri");
		tr.add("neel");
		tr.add("sagar");
		tr.add("om");
		tr.add("ansh");
		
		System.out.println(tr.first());
		
		System.out.println(tr.last());
		
		System.out.println("---Remove first element---");
		tr.pollFirst();
		System.out.println(tr);
		
		System.out.println("---Remove last element---");
		tr.pollLast();
		System.out.println(tr);
		
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		
		System.out.println("---Print all data using iterator cursor---");
		Iterator<String> itr = tr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data using ForEach loop---");
		for(String s1: tr)
		{
			System.out.println(s1);
		}
		
		tr.clear();
		System.out.println(tr);
	
	}

}
