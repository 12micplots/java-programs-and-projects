import java.io.*;
import java.util.*;

public class Pattern
{
	public static void evenoddPattern(int n)
	{
		int i,j,k;
		for(i = 0; i < n; i++)
		{
			for(j = 1, k = i; j <= i; j++, k--)
			{
				if(k % 2 == 0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("* ");
					
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int n= 6;
		evenoddPattern(n);
	}
}
			