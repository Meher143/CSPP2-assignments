/**
 * imports scanner.
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * { attributes and methods are given }.
     */
    private String data;
    private int length;
    /**
     * Constructs the object.
     *
     * @param      name  The name
     */

    InputValidator(final String name) {
        data = name;
        length = data.length();
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    boolean validateData() {
        final int i = 6;
        if (length >= i) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * main function to perform validation.
     */
    private Solution() {

    }
    /**
     * @param args array of strings.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }
}
