package logicalPrograms;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String s="xyz";   //zyx
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is: "+ rev);
		
	}

}
