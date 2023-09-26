package Exception_handling;

public class Ex1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0; 
		int div=0;
		
		try
		{
			div=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
		}
		
		System.out.println(div);
		System.out.println("Hi");
		
		
	}

}
