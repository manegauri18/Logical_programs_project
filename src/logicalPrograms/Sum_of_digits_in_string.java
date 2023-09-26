package logicalPrograms;

public class Sum_of_digits_in_string 
{
	public static void main(String[] args) 
	{
        String s1="welcome12to3the4worldof5java";
		String temp="0";
		int sum=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else
			{
				sum= sum+ Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum);
	}

}
