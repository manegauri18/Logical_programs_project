package Exception_handling;

public class Ex6 
{
	public static void main(String[] args) 
	{
		int ar []= {10,20,30,40};
		String s1="java";
		
		try
		{
			System.out.println(ar[7]);
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		try
		{
			System.out.println(s1.charAt(8));
		}
		
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
	}

}
