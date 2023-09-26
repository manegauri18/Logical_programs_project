package Practice_logicalPattern_programs;

public class demo25 
{
	public static void main(String[] args) 
	{
		String ar []= {"java", "python", "ruby", "java", "c++"};
		boolean flag=false;
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("Duplicate string is: "+ar[i]);
					flag=true;
				}
			}
		}
		
		if (flag==false) 
		{
			System.out.println("no duplicates found");
		} 
	
		
		
		
	}

}
