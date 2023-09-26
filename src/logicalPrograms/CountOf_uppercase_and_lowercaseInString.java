package logicalPrograms;

public class CountOf_uppercase_and_lowercaseInString 
{
	public static void main(String[] args) 
	{
		String str="Hello WorlD";
		int uppercase=0;
		int lowercase=0;
		
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch>'A' && ch<'Z')
			{
				uppercase++;
			}
			else if(ch>'a' && ch<'z')
			{
				lowercase++;
			}
		}
		System.out.println("Upeercase letter count is: "+uppercase);
		System.out.println("Lowercase letter count is: "+lowercase);

		
	}

}
