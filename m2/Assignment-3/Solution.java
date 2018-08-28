import java.util.Scanner;
/**
    *class Solution.
*/
public final class Solution {
    /**
        *Solution constructor.
    */
    private Solution() {

    }
    /**
    *Do not modify this main function.
    *@param args arguments.
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
        *Need to write the power function and print the output.
        *@param a arguments.
        *@param b arguments.
        *@return argument.
    */

    static long power(final int a, final int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);

    }
}
