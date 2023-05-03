import java.util.Scanner;

public class Calculator {

	/*
	 * Create a Custom Class:

	* Create a Java Calculator Class that does the following five commands:
    * - An add method that takes in two integer numbers and adds them 
    * 	together the call to that method would look like this: add(int num1, int num2)
    * - A subtraction method that takes in two integers and subtracts 
    * 	them from one another would look like this: subtract(int num1, int num2)
    * - A multiplication method that takes in two integer numbers 
    * 	and multiplies them together the call to that method would 
    * 	look like this: multiply(int num1, int num2)
    * - A division method that takes in two integer numbers and divides 
    * 	them the call to that method would look like this: divide(int num1, int num2)
    * - A square method that takes in one integer and squares it: 
    * 	square(int num1, int num2)
	 */
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int square(int num) {
		int total = (int)Math.pow(num, 2);
		return total;
	}
	
		
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	/*	System.out.print("Enter Number: ");
		int num1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		System.out.println(add(num1, num2));
		*/
		
		System.out.print(MagicCalculator.factorial(7));

	}
	
	
}
