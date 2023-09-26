package logicalPrograms;

public class Prime_num_list_from_1to100 
{
	public static void main(String[] args) 
	{
		int temp=0;
		
		for(int num=1; num<=100; num++)
		{
			for(int i=2; i<=num-1; i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(num);
			}
			else
			{
				temp=0;
			}
		}
	}

}
