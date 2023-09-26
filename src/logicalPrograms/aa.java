package logicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aa 
{
	public static void main(String[] args) 
	{
		String str="my name is gauri";
		String[] ar = str.split(" ");
		
		
		for(int i=0; i<ar.length; i++)
		{
			String org= ar[i];
			String rev="";
			
			for(int j=org.length()-1; j>=0; j--)
			{
				rev= rev+ org.charAt(j);
			}
			
				System.out.print(rev+" ");
			
		}
	
	}
	
	
}
