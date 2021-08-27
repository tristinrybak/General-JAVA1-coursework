// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch7 Prog 12
//
import java.util.Scanner;

public class Prog7_12 {
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner
		int[] numbers = new int[10];	// Create an array of length ten

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers that are seperated by spaces: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		// Use method to reverse the numbers
		reverse(numbers);

		// Display the numbers
		for (int e: numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	// Method reverse reverses the array passed in the argument
	public static void reverse(int[] list) {
		int temp;
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}
}