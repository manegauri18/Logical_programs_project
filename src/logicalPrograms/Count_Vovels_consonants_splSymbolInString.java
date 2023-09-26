package logicalPrograms;

public class Count_Vovels_consonants_splSymbolInString
{
	public static void main(String[] args) 
	{
		String s1="WELCOME TO THE WORLD OF JAVA";
		
		char[] s2 = s1.toCharArray();
		int size = s2.length;
		int vovcnt=0;
		int consocnt=0;
		int splcnt=0;
		
		int i=0;
		while(i!=size)
		{
			if(s2[i]>='A' && s2[i]<='Z')
			{
				if (s2[i]=='A' || s2[i]=='E' || s2[i]=='I' || s2[i]=='O' || s2[i]=='U') 
				{
					vovcnt++;
				} 
				else 
				{
					consocnt++;
				}
			}
			else
			{
				splcnt++;	
			}
			i++;
		}
		
		System.out.println(s2);
		System.out.println("Vowel count is: "+vovcnt);
		System.out.println("Conconant count is: "+consocnt);
		System.out.println("Special symbol. count is: "+splcnt);
		
	}

}
