package Pattern_programs;

public class Number_pattern4 
{
//	         1
//	        212 
//	       32123
//	      4321234
//	     543212345 
	        
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=7; k>=i-1; k--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
		//----"Second half"----
		   
			for(int j=2; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		    }
		}
		
	}


