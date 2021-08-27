// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch4 Program 18
// Display 2 character display

import java.util.Scanner;

public class Ch4P18 {
	public static void main(String[] args) {
//Create Scanner
Scanner Input = new Scanner(System.in);

//Prompt User
System.out.println( "Enter two characters that represent the major and status you identify with. The first ");
System.out.println( "character indicates the major you attend, and the second is a number character which " );
System.out.println( "indicates whether you are a freshman, sophomore, junior, or senior student." );
System.out.println("The following chracters are used to denote the majors and status:" );
System.out.println( "M: Mathematics" );
System.out.println( "C: Computer Science" );
System.out.println( "I: Information Technology" );
System.out.println( "1: Freshman" );
System.out.println( "2: Sophomore" );
System.out.println( "3: Junior" );
System.out.println( "4: Senior" );
System.out.println(" ");
System.out.println("Insert your identification here.(Ex. M1 = Mathmatics Freshman) ");
//
String str = Input.nextLine();

if (str.charAt(0) == 'M')
	System.out.print("Mathematics ");
else if(str.charAt(0) == 'm')
	System.out.print("Mathematics ");
else if(str.charAt(0) == 'C')
	System.out.print("Computer Science ");
else if(str.charAt(0) == 'c')
	System.out.print("Computer Science ");
else if(str.charAt(0) == 'I')
	System.out.print("Information Technology ");
else if(str.charAt(0) == 'i')
	System.out.print("Information Technology ");
else{
	System.out.print("You have chosen an invalid major, your status is ");
}

if (str.charAt(1) == '1')
	System.out.println("Freshman ");
else if(str.charAt(1) == '2')
	System.out.println("Sophomore ");
else if(str.charAt(1) == '3')
	System.out.println("Junior ");
else if(str.charAt(1) == '4')
	System.out.println("Senior ");
else{
	System.out.println("is your major status, please choose a valid status input");
}
		}
}