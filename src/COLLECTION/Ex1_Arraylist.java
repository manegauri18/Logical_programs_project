package COLLECTION;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex1_Arraylist
{
	public static void main(String[] args) 
	{
		Vector V = new Vector();  //default size 10
		V.add("java");
		V.add(101);
		V.add(75.6f);
		V.add('A');
		V.add(null);
		V.add(null);
		V.add(101);
		
		System.out.println(V);
		System.out.println(V.size());
 		System.out.println(V.isEmpty());
 		System.out.println(V.get(0));
 		
 		
 		V.add(1, 220);
 		System.out.println(V);
 		
 		V.remove(2);
 		System.out.println(V);
 		
 		System.out.println("---Print info using iterator cursor---");
 		Iterator itr = V.iterator();
 		
 		while(itr.hasNext())
 		{
 			System.out.println(itr.next());
 		}
 		
 		System.out.println("---Print info using List_iterator cursor---");
 		ListIterator litr = V.listIterator();
 		
 		while(litr.hasNext())
 		{
 			System.out.println(litr.next());
 		}
 		
 		System.out.println("---Print info using for loop---");
 		for(int i=0; i<=V.size()-1; i++)
 		{
 			System.out.println(V.get(i));
 		}
 		
 		System.out.println("---Print info using forEach loop---");
 		for(Object s1 : V)
 		{
 			System.out.println(s1);
 		}
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 		
 		
 		
 		
		
		
		
	}

}
