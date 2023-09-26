package Pattern_programs;

public class Char_program3 
{
//	A
//	B C
//	D E F
//	G H I J
//	K L M N O

	public static void main(String[] args)
	{
		char ch='A';
		
		for(int i=1; i<=5; i++)
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
