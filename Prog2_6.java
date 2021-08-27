// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch2 Prog 6
/* "Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. */

import java.util.Scanner;

public class Prog2_6 {
public static void main(String [] args){

Scanner input = new Scanner(System.in);
//prompt
System.out.print("Enter digit BETWEEN 0 & 1000: ");

int number = input.nextInt();

  //Isolate ones digit
int ones = number % 10;
  //Extract ones digit
number = number / 10;

  //Isolate tens digit
int tens = number % 10;
  //Extract tens digit
number = number / 10;

  //Isolate hundreds digit
int hundreds = number % 10;
  //Extract hundreds digit
number = number / 10;

  //total sum of digits
int sum = ones + tens + hundreds;

  //Results
System.out.println("The sum of the digits in the integer is " + sum );

}
}