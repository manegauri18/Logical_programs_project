package Practice_logicalPattern_programs;

public class demo23 
{
	public static void main(String[] args)
	{
		String s1="neel";
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev= rev+ s1.charAt(i);
		}
		System.out.println("Reverse string is: "+rev);
		
		if(s1.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
