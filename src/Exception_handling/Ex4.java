package Exception_handling;

public class Ex4 
{
	public static void main(String[] args) 
	{
		String s1="java";
		
		try
		{
			System.out.println(s1.charAt(6));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Generic exception handled");
		}
		
		System.out.println("Hello");
		
		
	}

}
