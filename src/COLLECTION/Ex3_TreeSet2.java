package COLLECTION;

import java.util.ArrayList;

public class Ex3_TreeSet2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("c++");
		al.add("java");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		for(String s1 : al)
		{
			System.out.println(s1);
		}
		
	}

}
