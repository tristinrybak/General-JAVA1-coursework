// CS 1100 - Tristin Rybak
// 11:00 TR Fall 2019
// Ch7 Prog 1
//
import java.util.Scanner;
public class Prog7_1 {

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the total number of students
		System.out.print("Enter the nubmer of students: ");
		int[] scores = new int[input.nextInt()];
		char[] grades = new char[scores.length];

		// Prompt the user to enter all the scores
		System.out.print("Enter " + scores.length + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}

		// Get grades
		getGrades(scores, grades);

		// Display results
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " +
				scores[i] + " and grade is " + grades[i]);
		}
	}

	// Method max returns the is highest score
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	// Method getGrade assigns grades based on grading scheme
	public static void getGrades(int[] scores, char[] grades) {
		int best = max(scores);
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best - 10)
				grades[i] = 'A';
			else if (scores[i] >= best - 20)
				grades[i] = 'B';
			else if (scores[i] >= best - 30)
				grades[i] = 'C';
			else if (scores[i] >= best - 40)
				grades[i] = 'D';
			else
				grades[i] = 'F';
		}
	}
}