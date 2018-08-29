
import java.util.Scanner;
/*
    Do not modify this main function.
    */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }

    /*
    Need to write the gcd function and print the output.
    */
    public static int gcd(final int n1, final int n2) {
        /**
         * { item_description }
         */
        for(int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
