package logicalPrograms;

public class WAP_to_remove_space_in_string 
{
	public static void main(String[] args) 
	{
		String s1=" j ava re move sp a ce ";
		
		String str = s1.replace(" ", "");
		
		//System.out.println(str.substring(0, 4));
		
		System.out.println((str.substring(0, 4))+" "+(str.substring(4,10))+" "+(str.substring(10)));
		
		
	}

}
