package logicalPrograms;

public class FindLargest_smallest_numbersFromArray 
{
	public static void main(String[] args) 
	{
		int [] ar1= {5,12,-7,3,8};
		
		int largest= ar1[0];
		int smallest= ar1[0];
		
		for(int s1: ar1)
		{
			if(s1>largest)
			{
				largest= s1;
			}
			else if(s1<smallest)
			{
				smallest= s1;
			}
		}
		
//		for(int i=1; i<numbers.length; i++)
//		{
//			if(numbers[i]>largest)
//			{
//				largest = numbers[i];
//			}
//			else if(numbers[i]<smallest)
//			{
//				smallest = numbers[i];
//			}
//		}
		
		System.out.println("largest num is: "+largest);
		System.out.println("smallest num is: "+smallest);
	}

}
