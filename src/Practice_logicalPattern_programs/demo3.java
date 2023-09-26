package Practice_logicalPattern_programs;

public class demo3 {

//	A
//	A B
//	A B C
//	A B C D
	
	public static void main(String[] args)
	{
	   
	    
	    for(int i=1; i<=4; i++)
	    {
	    	 char ch='A';
	    	for(int j=1; j<=i; j++)
	    	{
	    		System.out.print(ch+" ");
	    		ch++;
	    	}
	    	System.out.println();
	    }

	}

}
