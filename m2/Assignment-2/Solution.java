import java.util.Scanner;
/** this is a program.**/

final class Solution {
	/**
	*Do not modify this main function.
	**/
	private Solution() { }
	/** 
	* @parem args comment
	**/
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	/**
	* @parem a comment
	* @parem b comment 
	* @parem c comment
	**/
	public static void rootsOfQuadraticEquation(final int a, final int b, final int c){
		double r1;
		double r2;
		r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		r2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
		System.out.println(r1 + " " + r2);
	}
}
