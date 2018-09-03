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

    InputValidator(String name) {
        data = name;
        length = data.length();
    }
    boolean validateData() {
        if (length >= 6) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * main function to perform validation.
     */
    private Solution() {

    }
    /**
     * @param args array of strings.
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }
}
