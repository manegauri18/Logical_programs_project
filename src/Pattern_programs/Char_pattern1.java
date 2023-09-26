package Pattern_programs;

public class Char_pattern1 
{
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE

	public static void main(String[] args) 
	{
		char ch='A';
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		
	}

}
