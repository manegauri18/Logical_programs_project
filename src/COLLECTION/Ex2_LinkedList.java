package COLLECTION;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex2_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll =new LinkedList();
		ll.add("Neel");
		ll.add(201);
		ll.add(78.9f);
		ll.add('A');
		ll.add(null);
		ll.add("Neel");
		ll.add(null);
		
		ll.add(1, 520);
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		System.out.println(ll.isEmpty());
		
		System.out.println("---Print all data using iterator cursor---");
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data using List_iterator cursor---");
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print data using for loop---");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---Print data using forEach loop---");
		for(Object s1 : ll)
		{
			System.out.println(s1);
		}
		
		ll.clear();
		System.out.println(ll.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
