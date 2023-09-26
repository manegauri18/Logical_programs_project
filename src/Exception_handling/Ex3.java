package Exception_handling;

public class Ex3 
{
	public static void main(String[] args)
	{
		String s1="java";
		
		try
		{
			System.out.println(s1.charAt(6));   //Risky code
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		catch(ArithmeticException e3)
		{
			System.out.println("ArithmeticException handled");
		}
		
		System.out.println("Hi");
	}

}
