package Practice_logicalPattern_programs;

public class demo8 
{
	public static void main(String[] args)
	{
		int num=16461;
		int revNum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			revNum= revNum*10 + rem;
		}
		System.out.println("Reverse number is: "+revNum);
		
		if (num==revNum) 
		{
			System.out.println("Given number is palindrome number");
		} 
		else 
		{
            System.out.println("Given number is not palindrome");
		}
		
	}

}
