
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
 /**
     * Constructs the object.
     */
    private Solution() {

    }
/**
	* Fill the main function to print the maximum of the array.
 *
 * @param      args  The arguments
 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max ;
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
        System.out.println(max);
    }
		

	}
	
