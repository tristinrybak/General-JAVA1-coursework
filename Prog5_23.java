// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch5 Prog 23 Extra Credit

public class Prog5_23 {

	public static void main(String[] args) {
		// Compute series from left to right
		double sumLeftToRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			sumLeftToRight += 1 / i;
		}

// Display result of series sum from left to right
		System.out.println("Summation of series left to right: " + sumLeftToRight);

// Compute series
		double sumRightToLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--) {
			sumRightToLeft += 1 / i;
		}

// Display result of series sum
		System.out.println("Summation of series right to left: " + sumRightToLeft);

// Compare results
		System.out.println("Summation of the series right to left - "
			+ "Summation of the series left to right: "
			+ (sumRightToLeft - sumLeftToRight));
	}
}