package logicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class find_the_frequency_of_elements_in_java_array 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,3,2,9,2,8,3,9,2};
		
		HashMap<Integer, Integer> mp= new HashMap();
		
		for(int i=0; i<ar.length; i++)
		{
			if(mp.containsKey(ar[i]))
			{
				mp.put(ar[i], mp.get(ar[i])+1);
			}
			else
			{
				mp.put(ar[i], 1);
			}
		}
		
		System.out.println(mp);
		
//		Set<Integer> allKeys = mp.keySet();
//		
//		for(Integer key : allKeys) 
//		{
//			System.out.println(key+":->"+mp.get(key));
//		}
	}

}
