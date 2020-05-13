package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective= JOptionPane.showInputDialog(null, "Enter and adjective:");
		// Get the user to enter a type of liquid
		String liquid=JOptionPane.showInputDialog(null, "Enter and liquid:");
		// Get the user to enter a body part
		String bodyPart=JOptionPane.showInputDialog(null, "Enter and bodyPart:");
		// Get the user to enter a verb
		String verb=JOptionPane.showInputDialog(null, "Enter and verb:");
		// Get the user to enter a place
		String place=JOptionPane.showInputDialog(null, "Enter and place:");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// "String is my name " + name +  "    a  " + "     b    " + 9  --> "String is my name Charlie     a      b     9"
		
		JOptionPane.showMessageDialog(null, "Piranhas are more " +adjective+ " during the day, " + "\n"
				+ "so cross the river at night. Piranhas are attracted to fresh " +liquid+ "\n"
			+ " and will most likely take a bite out of your " +bodyPart+ " if you " +verb+ "\n"
			+ ". Whatever you do, if you have an open wound, try to find another way to get back \n"
			+ "to the " +place+ ". Goodluck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

