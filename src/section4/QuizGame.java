package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog(null, "What is a?: 2a-18=-4a:");
		// 3. Use an if statement to check if their answer is correct
		if (input.equals("3")) {
			JOptionPane.showMessageDialog(null, "You are correct, good job!");

			score++;

		} else {
			JOptionPane.showMessageDialog(null,
					"You are incorrect, sorry. But don't worry, every mistake is a learning experience!");
		}
		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer = JOptionPane.showInputDialog(null, "Which side of the Roman Empire fell? A: Eastern B: Western");
		if (answer.equals("B")) {
			JOptionPane.showMessageDialog(null, "Congrants, you got it correct!");
			score++;

		} else {
			JOptionPane.showMessageDialog(null, "Sorry, but wrong answer. Nice try though!");
		}
		JOptionPane.showMessageDialog(null,"You have now completed the quiz, good job!");
		// 6. After all the questions have been asked, print the user's score
		System.out.println(score);
	}
}
