package Exception_handling;

public class Ex7 
{
	public static void main(String[] args)
	{
		int ar []= {10,20,30};
		String s1="java";
		
		try
		{
			try  //nested try block
			{
				System.out.println(ar[8]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("ArrayIndexOutOfBoundsException handled");
			}
			
			System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
	}

}
