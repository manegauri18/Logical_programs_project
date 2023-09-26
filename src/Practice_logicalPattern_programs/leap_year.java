package Practice_logicalPattern_programs;

public class leap_year {

	public static void main(String[] args)
	{
		int year=1992;
		
		if(year%400==0 || year%4==0 & year%100!=0)
		{
		    System.out.println("Given year is leap year");	
		}
		else
		{
			System.out.println("not leap year");
		}
		

	}

}
