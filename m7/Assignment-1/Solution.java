import java.util.*;
class InputValidator
{
	/*Write the atrributes and methods for InputValidator*/
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
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);
    	System.out.println(i.validateData());

    }

}
