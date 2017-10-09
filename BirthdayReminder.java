
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 13th";
		String dadsBirthday = "March 3th";
		String myBirthday = "April 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday= JOptionPane.showInputDialog(null, "Who's birthday would you like to discover?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("mom")){
			JOptionPane.showMessageDialog(null, "July 13th");
		}else if(birthday.equals("dad")){
			JOptionPane.showMessageDialog(null, "March 3th");

		}else if (birthday.equals("me")){
			JOptionPane.showMessageDialog(null, "April 17th");

		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
