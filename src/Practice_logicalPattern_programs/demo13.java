package Practice_logicalPattern_programs;

import java.util.Arrays;

public class demo13 
{
	public static void main(String[] args) 
	{
		int a []= {1,2,3,4,5,6};
		int b []= {1,2,3,4,8,6};
		
		boolean result = Arrays.equals(a, b);
		
		if (result==true) 
		{
			System.out.println("Arrays are equal");
		} 
		else 
		{
            System.out.println("Arrays are not equal");
		}
		
	}

}
