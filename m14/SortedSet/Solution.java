
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.Arrays;
/**
 * Class for sorted set.
 */
class SortedSet extends Set {
    /**
     * Constructs the object.
     */
    SortedSet() {
        
    }
    /**
     * { function_description }
     *
     * @param      fromElement  The from element
     * @param      toElement    To element
     *
     * @return     { description_of_the_return_value }
     */
    public int[] subSet(final int fromElement, final int toElement) {
        final int m = 10;
        int[] arr = new int[m];
        if (fromElement > toElement) {
            System.out.println("Invalid Arguments to Subset Exception");
            return null;
        }
        int count=0;
        for (int i = 0,j = 0; i < size; i++) {
            if (set[i] >= fromElement && set[i] < toElement) {
                arr[j++]=set[i];
                count++;
            }
        }
        return Arrays.copyOf(arr, count);
    }
    /**
     * { function_description }
     *
     * @param      toElement  To element
     *
     * @return     { description_of_the_return_value }
     */
    public int[] headSet(final int toElement) {
        final int k = 10;
        int[] array = new int[k];
        int count = 0;
        for (int i = 0,j = 0; i < size; i++) {
            if (set[i] < toElement) {
                array[j++] = set[i];
                count++;
            }
        }
        return Arrays.copyOf(array,count);
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int last() {
        if (size != 0) {
            return set[size - 1];   
        }
        System.out.println("Set Empty Exception");
        return -1;
    }
    /**
     * Adds all.
     *
     * @param      array  The array
     */
    public void addAll(int[] array) {
        for (int i : array) {
            add(i);
        }
    }
    /**
     * { function_description }
     *
     * @param      element  The element
     */
    @Override
    public void add(final int element) {
        int index = 0;
        if (!(contains(element))) {
            int i;
            for (i = 0; i < size; i++) {
                if (set[i] > element) {
                    index = i;
                    break;
                }
            }
            if (i == size) {
                index = i;
            }
            for (int j = size; j > index; j--) {
                set[j] = set[j - 1];
            }
            set[index] = element;
            size++;
        }
    }
}
/**
 * class named solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("{}")) {
            return new int[0];
        }
        if (s.contains("{")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        SortedSet s = new SortedSet();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                // case "contains":
                // System.out.println(s.contains(Integer.parseInt(tokens[1])));
                // break;
                case "print":
                System.out.println(s);
                break;
                case "addAll":
                if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        s.addAll(temp);
                    }
                break;
                case "subSet":
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    int[] tmp = s.subSet(Integer.parseInt(arrstring3[0]),
                        Integer.parseInt(arrstring3[1]));
                    if (tmp != null) {
                        System.out.println(Arrays.toString(tmp).replace(
                            "[", "{").replace("]", "}"));
                    }
                break;
                case "headSet":
                    System.out.println(Arrays.toString(s.headSet(
                        Integer.parseInt(tokens[1]))).replace(
                    "[", "{").replace("]", "}"));
                break;
                case "last":
                System.out.println(s.last());
                break;
                case "add":
                    String[] t = tokens[1].split(",");
                    s.add(Integer.parseInt(tokens[1]));
                break;
                default:
                break;
            }
        }
    }
}