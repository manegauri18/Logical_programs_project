package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex5_arrayList {

	public static void main(String[] args)
	{
	    ArrayList al = new ArrayList();
	    al.add("java");
	    al.add(101);
	    al.add(75.4f);
	    al.add("java");
	    al.add(null);
	    al.add(null);
	    
	    System.out.println(al);
	    System.out.println(al.get(2)); //75.4
	    System.out.println(al.isEmpty());  //false
	    System.out.println(al.size());  //6
	    
	    al.add(1, 500);
	    System.out.println(al);
	    
	    al.remove(null);
	    System.out.println(al);
	    
	    System.out.println("---Print all data in arraylist using iterator");
	    Iterator itr = al.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("---Print all data in arraylist using List_iterator");
	    ListIterator litr = al.listIterator();
	    
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    
	    System.out.println("---Print all data in arraylist using for loop---");
	    for(int i=0; i<=al.size()-1; i++)
	    {
	    	System.out.println(al.get(i));
	    }
	    
	    System.out.println("---Print all data in arraylist using forEach loop---");
	    
	    for(Object s1 : al)
	    {
	    	System.out.println(s1);
	    }
	    
	    al.clear();
	    System.out.println(al.size());
	    

	}

}
