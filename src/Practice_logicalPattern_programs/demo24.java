package Practice_logicalPattern_programs;

public class demo24 
{
	public static void main(String[] args) 
	{
		int num=16461;
		int rev=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem= i%10;
			rev= rev*10 + rem;
		}
		System.out.println("Reverse number is: "+rev);
		
		if (num==rev) 
		{
			System.out.println("Number is palindrome number");
			
		} 
		else
		{
             System.out.println("Not palindrome");
		}
		
		
		
		
		
	}

}
