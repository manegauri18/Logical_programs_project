package logicalPrograms;

public class Find_Missing_Numbers_in_Array 
{
	public static void main(String[] args) 
	{
		int a1 []= {1,2,4,5};
		
		int sum1=0;
		
		for(int i=0; i<a1.length; i++)
		{
			sum1=sum1+a1[i];
		}
		System.out.println("Sum of elements in array is: "+sum1);
		
		int sum2=0;
		
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array: "+sum2);
		
		System.out.println("Missing number is: "+ (sum2-sum1));
		
	}

}
