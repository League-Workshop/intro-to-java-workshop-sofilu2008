package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Robot robot = robot
	Robot robot = new Robot();
	
	void go() {
		// 4. Make the robot move as fast as possible
		robot.setSpeed(100);
		robot.penDown();
		robot.setPenWidth(100);
		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for( int repeat = 0; repeat < 4; repeat++) {

			// 7. Set the pen color to random

			
			robot.setRandomPenColor();
	
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			robot.turn(90);
	       
		}

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		robot.move(1000);
		robot.turn(90);
		robot.move(1000);
		robot.turn(90);
		robot.move(1000);
		robot.turn(90);
		robot.move(1000);
		robot.turn(90);

	}
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



