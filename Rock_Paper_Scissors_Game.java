// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch3 Prog 17
// Rock Paper Scissors
//
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {

//Generate Computer Choice
public static String generateComputerChoice( Random random ){
	int wordNumber;
	wordNumber = random.nextInt( 3 )+ 1; //1, 2, 3
	String computerWordChoice = " ";

	if(wordNumber == 1 ) { //== means compare
		computerWordChoice = "rock";
	} else if( wordNumber == 2 ){
		computerWordChoice = "paper";
	} else if( wordNumber == 3 ){
		computerWordChoice = "scissors";
	}
	System.out.println( "The computer has made its choice.");
	return computerWordChoice;

}

public static void showMenu( ){
	System.out.println( "1. Rock\n2. Paper\n3. Scissors" );
}

public static String getUserChoice(Scanner scanner) {
	String userWordChoice;

	System.out.println( "User, please make your choice: " );
	userWordChoice = scanner.input();

	return userWordChoice;
}

 public static void main(String[] args) {

	Random random = new Random();
	Scanner scanner = new Scanner( System.in );

showMenu();
	}



}