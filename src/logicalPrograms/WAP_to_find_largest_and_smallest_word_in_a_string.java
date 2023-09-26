package logicalPrograms;

public class WAP_to_find_largest_and_smallest_word_in_a_string 
{
	public static void main(String[] args) 
	{
        String s1= "welcome to the world online java programming";
		String[] str = s1.split(" ");
		
		String shortest= str[0];
		String largest = str[0];
		
		
		for(int i=1; i<str.length; i++)
		{
			if(str[i].length()>largest.length())
			  {
				  largest= str[i];
			  }
		    else if(str[i].length()<shortest.length())
		      {
			      shortest= str[i];
		      }
			
		}
		
		System.out.println("largest string is: "+largest);
		System.out.println("smallest string is: "+shortest);
	}

}
