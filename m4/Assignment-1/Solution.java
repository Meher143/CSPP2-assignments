
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max ;
		
		n = sc.nextInt();
        int a[] = new int[n];
     
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int j = 0; j < n; j++)
        {
            if(max < a[j])
            {
                max = a[j];
            }
        }
        System.out.println("Maximum value:"+max);
    }
		

	}

