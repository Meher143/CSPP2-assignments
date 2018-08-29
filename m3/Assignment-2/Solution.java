
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
/**
 * Fill the main function to print the number of 7's between 1 to n.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        int m;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 0) {
                m = j % 10;
                if (m == 7) {
                    count += 1;
                }
                j = j / 10;
            }

        }
        System.out.println(count);
    }
}
