
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

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int m;
        final int ten = 10;
        final int seven = 7;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 0) {
                m = j % ten;
                if (m == seven) {
                    count += 1;
                }
                j = j / ten;
            }

        }
        System.out.println(count);
    }
}
