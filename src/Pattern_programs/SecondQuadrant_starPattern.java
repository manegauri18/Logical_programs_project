package Pattern_programs;

public class SecondQuadrant_starPattern 
{
//	    *
//	   **
//	  ***
//	 ****
//	***** 
	public static void main(String[] args)
	{
		int star=1;
		int spaces=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=spaces; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			spaces--;
				
		}
		
	}

}
