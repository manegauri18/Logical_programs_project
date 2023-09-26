package logicalPrograms;

public class WAP_to_remove_characters_from_first_string_which_are_present_in_the_second_string 
{
	public static void main(String[] args) 
	{
		String str1 = "gaurimane";
		String str2 = "gaurav";
		
		String s1 = removeCharacters(str1, str2);
		System.out.print(s1);
			
	}
		
	
	public static String removeCharacters(String str1, String str2) 
	{
        return str1.replaceAll("[" + str2 + "]", "");
    }	

}
