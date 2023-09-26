package Practice_logicalPattern_programs;

public class demo19 
{
//	A
//	B B
//	C C C
//	D D D D
	
	public static void main(String[] args)
	{
		char ch='A';
		
		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	   

	}

}
