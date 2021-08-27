// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch6 Program 3
// Reverse the integer and display a palindrome

import java.util.Scanner;

public class Prog6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

// Display the reversed number
		reverse(number);
}
//method
	public static void reverse(int number) {
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
       }
		System.out.println();
    }
  public static boolean isPalindrome(int number) {
	  return number == reverse(number);
}