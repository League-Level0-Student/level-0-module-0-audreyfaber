package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0 ;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input1 = JOptionPane.showInputDialog("What color is the sky?");
				// 3.  Use an if statement to check if their answer is correct
				if (input1.equals("Blue")) {
					score++ ;
					System.out.println("Correct!") ;
				} else { System.out.println("Incorrect") ;
				score-- ; }
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String input2 = JOptionPane.showInputDialog("How legs does a butterfly have?") ;
		if (input2.equals("6")) {
			score++ ;
			System.out.println("Correct!") ;
		} else { System.out.println("Incorrect") ;
		score-- ; }
		
		String input3=JOptionPane.showInputDialog("What is the captial of Montana?") ;
		if (input3.equals("Helena")) {
			score++ ;
			System.out.println("Correct!") ;
		} else { System.out.println("Incorrect") ;
		score-- ; }
		
        String input4=JOptionPane.showInputDialog("What is the most popular sport in the world? ") ;
		if (input4.equals("Soccer")) {
			score++ ;
			System.out.println("Correct!") ;
		} else { System.out.println("Incorrect") ;
		score-- ; }
		
		String input5=JOptionPane.showInputDialog("What sport does Roger Federer play?") ;
		if (input5.equals("Tennis")) {
			score++ ;
			System.out.println("Correct!") ;
		} else { System.out.println("Incorrect") ;
		score-- ; }
		String input6=JOptionPane.showInputDialog("What was Mozart's first name?") ;
		if (input6.equals("Wolfgang")) {
			score++ ;
			System.out.println("Correct!") ;
		} else { System.out.println("Incorrect") ;
		score-- ; }
		// After all the questions have been asked, tell the user their final score 
		System.out.println("Your final score is " + score);
	}
}
