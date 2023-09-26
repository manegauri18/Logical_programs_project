package Practice_logicalPattern_programs;

public class demo17 
{
	public static void main(String[] args)
	{
		String ar []= {"java", "python", "ruby", "c++", "java"};
		boolean flag = false;
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("Duplicates element in array is: "+ar[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("No duplicate element found in array");
		}
		
	}

}
