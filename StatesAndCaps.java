import java.util.Arrays;
import java.util.Scanner;

public class StatesAndCaps {
	
	public static void main(String[] args) {
	//New variables to hold user input and total right answers.	
		String answer;
		int right = 0;
	//New 2D string array. Elements of array added in curly braces.
		String[][] states = {
			{"Montgomery", "Alabama"},
			{"Juneau", "Alaska"},
			{"Phoenix", "Arizona"},
			{"Little Rock", "Arkansas"},
			{"Sacremento", "California"},
			{"Denver", "Colorado"},
			{"Hartford", "Connecticut"},
			{"Dover", "Delaware"},
			{"Tallahassee", "Florida"},
			{"Atlanta", "Georgia"},
			{"Honolulu", "Hawaii"},
			{"Boise", "Idaho"},
			{"Springfield", "Illinois"},
			{"Indianapolis", "Indiana"},
			{"Des Moines", "Iowa"},
			{"Topeka", "Kansas"},
			{"Frankfort", "Kentucky"},
			{"Baton Rouge", "Louisiana"},
			{"Augusta", "Maine"},
			{"Annapolis", "Maryland"},
			{"Boston", "Massachusettes"},
			{"Lansing", "Michigan"},
			{"Saint Paul", "Minnesota"},
			{"Jackson", "Mississippi"},
			{"Jefferson City", "Missouri"},
			{"Helena", "Montana"},
			{"Lincoln", "Nebraska"},
			{"Carson City", "Nevada"},
			{"Concord", "New Hampshire"},
			{"Trenton", "New Jersey"},
			{"Santa Fe", "New Mexico"},
			{"Albany", "New York"},
			{"Raleigh", "North Carolina"},
			{"Bismark", "North Dakota"},
			{"Columbus", "Ohio"},
			{"Oklahoma City", "Oklahoma"},
			{"Salem", "Oregon"},
			{"Harrisburg", "Pennsylvania"},
			{"Providence", "Rhode Island"},
			{"Columbia", "South Carolina"},
			{"Pierre", "South Dakota"},
			{"Nashville", "Tennessee"},
			{"Austin", "Texas"},
			{"Salt Lake City", "Utah"},
			{"Montpelier", "Vermont"},
			{"Richmond", "Virginia"},
			{"Olympia", "Washington"},
			{"Charleston", "West Virginia"},
			{"Madison", "Wisconsin"},
			{"Cheyenne", "Wyoming"}
		};
	//Displays all elements of the array.	
		for (int i = 0; i < states.length; i++) {
			System.out.println(Arrays.deepToString(states[i]));
		};
	//New variables to hold data as it is sorted.	
		String tempc;
		String temps;
	//Loops through pairs of capitols for below comparison.
		for (int i = 0; i < states.length; i++) {
		   	   for (int j = i + 1; j < states.length; j++) {
	/*Compares adjacent capitols and implements a bubble sort to rearrange key-value sets.
	  This was a very difficult process for me because, for the longest time, I could only sort the
	  capitols, but the states stayed in order, resulting in wrong capitol-state relationships.*/
				if (states[j][0].compareTo(states[i][0]) < 0) {
					tempc = states[i][0];
					states[i][0] = states[j][0];
					states[j][0] = tempc;
	/*This is how I solved the issue in the above multi-line comment. Is sorts the states.
	  It's such a simple solution, but it took me hours to come up with. I'm not sure if
	  this is how it is expected to be done, but it worked for me and I am very proud of
	  finding a solution to what was the hardest part of this assignment.*/
					temps = states[i][1];
					states[i][1] = states[j][1];
					states[j][1] = temps;					
				}
			}
		}
	//New scanner object named input to accept user inputs.	
		Scanner input = new Scanner(System.in);
	//Iterates through all states to ask for capitol.	
	for (int i = 0; i < states.length; i++) {
		System.out.println("What's the capitol of " + states[i][1] + "?");
	//Answer variable stores user input	 
		 answer = input.nextLine();
	//Checks to see if user answered correctly and adds 1 to the total right answers.	 
		 	if (answer.equalsIgnoreCase(states[i][0])) {
		 		right++;
	//Lets user know if they got it right.
		 		System.out.println("That's right.");
		 			} else {
		 		System.out.println("No, it's " + states[i][0] + ".");
		 	}
		}
	//Calculates the total correct and a percentage correctly answered.
	System.out.print('\n'+ "You got " + right + "/" + states.length + " right,");
	System.out.print(" or " + 100*right/states.length + "%.");
	//Closes scanner.
	input.close();	
		};
	}