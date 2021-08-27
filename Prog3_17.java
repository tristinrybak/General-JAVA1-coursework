// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch3 Prog 17
// Rock Paper Scissors
//
import java.util.Random;

public class Rock_Paper_Scissors_Game {

//Generate Computer Choice
public static String generatComputerChoice( Random random ){
	int wordNumber;
	wordNumber = random.nextInt( 3 )+ 1; //1, 2, 3
	String computerWordChoice;

	if(wordNumber == 1 ) { //== means compare
		computerWordChoice = "rock";
	} else if( wordNumber == 2 ){
		computerWordChoice = "paper";
	} else if( wordNumber == 3 ){
		computerWordChoice = "scissors";
	}
	return computerWordChoice;

}

  public static void main(String[] args) {

	Random random = new Random();
	System.out.println( generatedComputerChoice( random ) );
	}



}