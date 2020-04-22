package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot ted = new Robot ();
	ted.setSpeed(125);
	ted.penDown();
	ted.setPenColor(Color.cyan);


	for ( int sides = 0; sides < 4; sides++ ) {
	ted.move(100);
	ted.turn(90);
	
	}
	
	
	}
	
	
}
