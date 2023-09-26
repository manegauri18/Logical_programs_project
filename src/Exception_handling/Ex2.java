package Exception_handling;

public class Ex2 
{
	public static void main(String[] args) 
	{
		int ar []= {1,2,3};
		
		try
		{
			System.out.println(ar[6]);
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
	}

}
