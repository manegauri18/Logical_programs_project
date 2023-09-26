package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("OM");
		al.add(105);
		al.add(74.3f);
		al.add('C');
		al.add(null);
		al.add(null);
		
		System.out.println(al.size());  //6
		System.out.println(al.isEmpty());  //false
		System.out.println(al.get(1));  //105
		System.out.println(al);
		
		System.out.println("---Add info in between arraylist---");
		al.add(3, "neel");
		System.out.println(al);
		
		System.out.println("---remove info in between arraylist---");
		al.remove(1);
		System.out.println(al);
		
		System.out.println("---Print all info using iterator cursor---");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info using ListIterator cursor---");
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all info using for loop---");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---Print all info using for each loop---");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		System.out.println(al.size());  //6
		
		al.clear();
		System.out.println(al.size());  //0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
