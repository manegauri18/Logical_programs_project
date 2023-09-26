package Practice_logicalPattern_programs;

public class demo6 
{
	public static void main(String[] args) 
	{
		String s1="My name is gauri";
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev +s1.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
