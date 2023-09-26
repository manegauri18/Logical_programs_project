package Practice_logicalPattern_programs;

public class demo15 
{   //print even & odd number from array
	public static void main(String[] args)
	{
		int ar[]= {1,2,3,4,5,6};
		
		System.out.println("---Print even number from list---");
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		
		System.out.println("---Print odd number from list---");
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}

}
