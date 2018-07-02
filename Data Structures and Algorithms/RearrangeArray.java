import java.util.*;
import java.lang.*;

public class RearrangeArray {
	//function to rearrange arrays such that arr[i]= i
	public static int[] fix(int[] A)
	{
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] != -1 && A[i] != i)
			{
				int x = A[i];

				//check if desired place is not vacate

				while (A[x] != -1 && A[x] != x)
				{
					//store the value from desired place
					int y = A[x];

					//place x to its correct position
					A[x] = x;

					//now y will become x and in the next step x needs a new place
					x = y;
				}
				//place x to its correct position
				A[x] = x;

				//check if the while loop has not set the correct value
				if(A[i] != i)
				{
					//if not, put -1 at the vacated place
					A[i] = -1;

				}
			}
		}
		return A; 
	}
	//driver function
	public static void main(String[] args) 
	{
		int A[] = {-1, -1, 5, 7, 6, -1, 1, 4, 2, -1};
		System.out.println(Arrays.toString(fix(A)));
	
	}

}

