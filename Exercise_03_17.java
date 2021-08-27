
import java.util.Scanner;

public class Exercise_03_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.println("Hello I am Billy! Would you like to play rock paper scissors?");
// Generate a random number 0, 1, or 2
		int billy = (int)(Math.random() * 3);

// User to enter a number 0, 1, or 2
		System.out.println("If so, please enter the number that correlates with your object.");
		System.out.print("Rock (0), Paper (1), Scissors (2): ");
		int human = input.nextInt();

//Result Calculation
		System.out.print("I choose ");
		switch (billy)
		{
			case 0: System.out.print("rock."); break;
			case 1: System.out.print("paper."); break;
			case 2: System.out.print("scissor.");
		}

		System.out.print(" You chose ");
		switch (human)
		{
			case 0: System.out.print("rock"); break;
			case 1: System.out.print("paper"); break;
			case 2: System.out.print("scissors ");
		}

// Result display
		if (billy == human)
			System.out.println("too. It is a draw");
		else
		{
			boolean win = (human == 0 && billy == 2)||
			              (human == 1 && billy == 0)||
			              (human == 2 && billy == 1);

		    boolean lose = (human == 2 && billy == 0)||
			               (human == 0 && billy == 1)||
			               (human == 1 && billy == 2);
			if (win)
				System.out.println(". You won ...");
			if (lose)
				System.out.println(". Sorry, You lose");
			if (human >= 3)
			    System.out.println("an invalid value... I guess that means I win!");
		}
	}
}
