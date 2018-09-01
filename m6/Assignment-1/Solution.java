import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        int num;
        int count = 0;
        for (int j = 1; j < n; j++) {
            for (num = j; num > 1; num--) {
                if (num % j == 0) {
                    count = count + 1;
                }
                if (count != 2) {
                    System.out.println("not prime");

                }
            }
        }
        for (int i = 1; i < n; i++) {
        if (n % i != 0) {
            System.out.println("not odd");
         }
    }
    System.out.println(n);

        }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
     }
 }
