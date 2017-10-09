
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for(int i= 0; i<1000;i++){
		Robot liz= new Robot();
		//3. ask the user what color they would like the robot to draw
	String color=	JOptionPane.showInputDialog(null,"What color would you like to set for your robot?");
		//4. use an if/else statement to set the pen color that the user requested
	if(color.equalsIgnoreCase("blue")){
		liz.setPenColor(Color.BLUE);
	}else{
		liz.setRandomPenColor();
	}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)

liz.setPenWidth(10);
liz.setSpeed(10);
for(int x= 0;i<4;i++){
liz.penDown();
liz.move(100);
liz.turn(90);


	}
}
	}
}