package logicalPrograms;

//How To Count Occurrences of a Character in a String
public class Count_occurences_of_char_in_string 
{
   public static void main(String[] args) 
   {
	String s="welcome to  the world of java programming";
	int total_count=s.length();
	int total_count_after_remove=s.replace("a", "").length();
	int count=total_count-total_count_after_remove;
	
	System.out.println("Total number of occurences of 'a' is: "+count);
}
}
