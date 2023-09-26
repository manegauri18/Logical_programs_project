package Exception_handling;

public class Ex5 
{
	public static void main(String[] args) 
	{
		String s1="abc";
		
		try
		{
			System.out.println(s1.charAt(6));  //risky code
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		catch(Exception e3)
		{
			e3.printStackTrace();
			System.out.println("Generic exception handled");
		}
		
		System.out.println("Hi");
		
		
		
		
	
		
	}

}
