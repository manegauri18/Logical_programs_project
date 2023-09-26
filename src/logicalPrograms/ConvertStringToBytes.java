package logicalPrograms;

import java.util.Arrays;

public class ConvertStringToBytes 
{
	public static void main(String[] args) 
	{
		String str ="Suresh";
		
		byte[] bytes = str.getBytes();
		
		System.out.println(Arrays.toString(bytes));
		
		System.out.println("------------------------------------------------");
		
		//convert byte to string 
		
		byte[] bytes2= {83, 117, 114, 101, 115, 104};
		
		String str2 = new String(bytes2);
		System.out.println(str2);
		
	}

}
