package Practice_logicalPattern_programs;

public class demo16 
{
	public static void main(String[] args) 
	{
		String s1="Welcome to pune";
		int count=1;
		
		for(int i=0; i<s1.length()-1; i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("number of words in string are: "+count);
		
		
	}

}
