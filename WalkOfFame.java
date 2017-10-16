
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot lly = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
lly.setX(50);
lly.penDown();
lly.setSpeed(100);
for(int x =0; x<14; x++){
	


for(int i = 0; i<5; i++){
	

lly.move(30);
lly.turn(144);
}
lly.penUp();
lly.setX(x* 50);
lly.penDown();

}

		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 	for (int i=1;i < 8;i++ ){
		 *
		 * Hint: The distance between stars is 50.
		 */

	}

}
