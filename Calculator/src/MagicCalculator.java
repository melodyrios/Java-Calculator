
public class MagicCalculator extends Calculator {
	/*
	* Create a MagicCalculator that inherits its basic functionality from your calculator
	*  and does the following functions:
	    * Finds the square root of a number
	    * Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
	    * Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
	    * Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
	    * Finds the factorial (!) of the number
	 */
	
	public static int square(int num) {
		int total = (int)Math.pow(num, 2);
		return total;
	}
	
	public static double cosine(double a) {
		double result = Math.toRadians(a);
		return Math.cos(result);
	}
	
	public static double sin(double b) {
		double sinResult = Math.toRadians(b);
		return Math.sin(sinResult);
	}
	
	public static double tangent(double c) {
		double tanResult = Math.toRadians(c);
		return Math.tan(tanResult);
	}
	
	public static long factorial(int d) {
		long fact = 1;
		for(int i = 2; i <= d; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	
	
}
