package Practice_logicalPattern_programs;

public class demo12 
{
	public static void main(String[] args) 
	{
		String s1="Welcome to the world of automation";
		
		
		int Total_count = s1.length();
		
		int totalCountAfterRemove = s1.replace("m", "").length();
		
		int count= Total_count - totalCountAfterRemove;
		System.out.println("Number of occurences of 'm' are: "+count);
		
	}

}
