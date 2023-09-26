package Array;

import java.util.Arrays;

public class Ex1_String_array 
{
	public static void main(String[] args) 
	{
		int ar []= {9,1,3,4,7,6};
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("---Print all data in array---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);	
		}
		
		Arrays.sort(ar);
		
		System.out.println("---Print all data in ascending order---");
		
		for(int j=0; j<=ar.length-1; j++)
		{System.out.println(ar[j]);
			
		}
		
        System.out.println("---Print all data in descending order---");
		
		for(int k=ar.length-1; k>=0; k--)
		{System.out.println(ar[k]);
			
		}
		
	}

}
