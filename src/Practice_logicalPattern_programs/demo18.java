package Practice_logicalPattern_programs;

public class demo18 
{
	public static void main(String[] args) 
	{
		int ar []= {1,2,4,5};
		int sum1=0;
		
		for(int i=0; i<ar.length; i++)
		{
			sum1=sum1 + ar[i];
		}
		System.out.println("Sum of elements in array is: "+sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array is: "+sum2);
		
		System.out.println("Missing number in array is: "+(sum2-sum1));
	}

}
