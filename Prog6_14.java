// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch6 Prog 14
//
public class Prog6_14 {
	//Main Method
	public static void main(String[] args) {

		// Display table
		double start = 1;
		// Start series
		double end   = 901;
		// End series

		System.out.println("\ni           m(i)     ");
		System.out.println("---------------------");
		for (double i = start; i <= end; i += 100) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.4f\n", estimatePI(i));
		}
	}

	//Method estimatePI
	public static double estimatePI(double n) {
		double pi = 0;		// Set pi to 0
		for (double i = 1; i <= n; i ++) {
			pi += Math.pow(-1, i +1) / (2 * i - 1);
		}
		pi *= 4;
		return pi;
	}
}