import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int b[][] = new int[x][y];
		for (int i = 0;i < x;i++) {
			for (int j = 0;j < y;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[m][n];
		for(int i = 0; i < m;i++){
			for (int j = 0;j < n;j++){
				c[i][j] = a[i][j] + b[i][j];

			}
		}
		for (int i = 0; i < m;i++){
			for (int j = 0;j < n;j++){
				System.out.print(c[i][j]);


			}
			System.out.println();
		}
				
	}
}