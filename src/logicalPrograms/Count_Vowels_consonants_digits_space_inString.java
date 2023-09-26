package logicalPrograms;

public class Count_Vowels_consonants_digits_space_inString 
{
	public static void main(String[] args) 
	{
		String str= "This website is Aw3som3";
		String s1 = str.toLowerCase();
		
		int VowelCount=0;
		int ConsoCount=0;
		int DigitCount=0;
		int SpaceCount=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				VowelCount++;
			}
			else if(ch>='a' && ch<='z')
			{
				ConsoCount++;
			}
			else if(ch>='0' && ch<='9')
			{
				DigitCount++;
			}
			else if(ch==' ')
			{
				SpaceCount++;	
			}
		}
		
		System.out.println("Vowel count: "+VowelCount); 
		System.out.println("Conso count: "+ConsoCount);
		System.out.println("digit count: "+DigitCount);
		System.out.println("space count: "+SpaceCount);

		

		
	}

}
