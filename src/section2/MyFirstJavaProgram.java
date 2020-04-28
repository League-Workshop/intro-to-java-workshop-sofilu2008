package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	// 
	Robot robot = new Robot ();
	robot.penDown();
	robot.setPenColor(Color.blue);
	
	robot.setSpeed(100);
	
	robot.move(100);
	robot.turn(90);
    robot.move(100);
    robot.Turn(90);
    //"Sophia
    robot.move(100);
    
	}
}
    
    