package COLLECTION;

import java.util.ArrayList;

public class Example1_Array_List 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();   //default capacity 10
		
		al.add("Neel");
		al.add(115);
		al.add(57.8f);
		al.add('B');
		al.add(null);
		al.add(null);
		
		System.out.println(al.size());  //6
		System.out.println(al.get(3));  //B
		System.out.println(al);
		
		System.out.println("-------------------------");
		
		//add info in between arraylist
		al.add(2, 850);
		System.out.println(al);
		
		//remove info in between arraylist
		al.remove(1);
		System.out.println(al);
		
		
	}

}
