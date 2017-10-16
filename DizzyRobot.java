//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot lly = new Robot();
	public static void main(String[] args) {
		lly.setSpeed(100);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String spin = JOptionPane.showInputDialog(null, "How dizzy do you want your robot to be from the scale of 1-10");
int s =Integer.parseInt(spin);
for (int i = 0; i < s;i++){
	dance(10);
}
 // 1. Use the dance method to make the robot spin.
	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			lly.turn(360);
		}
	}
}

