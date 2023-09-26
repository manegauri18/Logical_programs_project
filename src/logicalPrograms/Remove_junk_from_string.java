package logicalPrograms;

public class Remove_junk_from_string
{
	public static void main(String[] args)
	{
		String s1="!^*&<<>?_ java $$@@@ selenium";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		
	}

}
