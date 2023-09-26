package logicalPrograms;

public class Swap_two_strings_without_third_variable 
{
	public static void main(String[] args) 
	{
		String s1= "good";
		String s2= "afternoon";
		
		System.out.println("String s1 before swap: "+s1);
		System.out.println("String s2 before swap: "+s2);
		
		
		s1= s1+s2;
		s2= s1.substring(0, (s1.length()-s2.length()));
		s1= s1.substring(s2.length());
	
			
		System.out.println("String s1 after swap: "+s1);
		System.out.println("String s2 after swap: "+s2);
	}

}
