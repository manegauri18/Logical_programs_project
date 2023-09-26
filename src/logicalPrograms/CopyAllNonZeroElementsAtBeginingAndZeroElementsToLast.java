package logicalPrograms;

public class CopyAllNonZeroElementsAtBeginingAndZeroElementsToLast 
{
	public static void main(String[] args)
	{
		int ar[]= { 1, 0, 2, 0, 3, 0, 0, 0 };
       //output = [1, 2, 3, 0, 0, 0, 0, 0]}
		
		 int n = ar.length;
		        
		 int[] output = new int[n];
		 int index = 0;
		        
		        // Copy non-zero elements to the beginning of the output array
		        for (int i = 0; i < n; i++) 
		        {
		            if (ar[i] != 0) 
		            {
		                output[index] = ar[i];
		                index++;
		            }
		        }
		        
		        // Fill the remaining elements with zeros
		        while (index < n) 
		        {
		            output[index] = 0;
		            index++;
		        }
		        
		        // Print the output array
		        for (int num : output) 
		        {
		            System.out.print(num + " ");
		        }
		    }

}
