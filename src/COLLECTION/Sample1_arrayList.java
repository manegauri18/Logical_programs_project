package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Sample1_arrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(101);
		al.add(75.5f);
		al.add('A');
		al.add(null);
		al.add(null);
		al.add("java");
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(1));
		
		al.add(2, "python");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		System.out.println("-------------------------------");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");
		
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---------------------------");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("-----------------------------");
		
		for(Object s1: al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
	}

}
