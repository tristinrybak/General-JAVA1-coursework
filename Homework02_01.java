// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch2 Prog 1
//Convert Celsius to Fahrenheit

import java.util.Scanner;

public class Homework02_01 {
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

// User prompt
System.out.print("Enter a degree in celcius: ");
double Celsius = input.nextDouble();

// Convertion equation
Double fahrenheit = (9.0 / 5.0) * Celsius +32;

// Results
System.out.println( Celsius + " celsius converts to " + fahrenheit + " fahrenheit");
  }
}