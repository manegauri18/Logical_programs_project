package Pattern_programs;

public class Char_pattern2
{
//	A
//	A B
//	A B C
//	A B C D
	
	public static void main(String[] args)
	{
		char ch='A';
		
		for(int i=1; i<=4; i++)
		{
			ch='A';
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}

}
