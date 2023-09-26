package logicalPrograms;

public class FirstNonRepeatingCharacterInString 
{
	    public static void main(String[] args) {
	        String input = "examplestring"; // Replace this with your input string
	        
	        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(input);
	        
	        if (firstNonRepeatingChar != '\0') 
	        {
	            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
	        } 
	        else 
	        {
	            System.out.println("No non-repeating character found in the given string.");
	        }
	    }
	    
	    public static char findFirstNonRepeatingCharacter(String input) 
	    {
	        int[] charCount = new int[256]; // Assuming ASCII characters
	        
	        for (char c : input.toCharArray()) 
	        {
	            charCount[c]++;
	        }
	        
	        for (char c : input.toCharArray()) 
	        {
	            if (charCount[c] == 1) {
	                return c;
	            }
	        }
	        
	        return '\0'; // Return null character if no non-repeating character found
	    }
	}



