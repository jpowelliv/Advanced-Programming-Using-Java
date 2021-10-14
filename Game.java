/* Joseph Powell IV 
CIS315
*3.17 (Game: scissor, rock, paper)
* Write a program that plays the popular scissor-rockpaper game. 
*(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
*The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
*The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. 
*Here are sample runs:
*2020/01/17
*/

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int compute = (int)(Math.random() * 3);
		
		//input
		System.out.print("Rock is(1), Paper is(2), and Scissor is(0), What's your number(): ");
		
		int player = input.nextInt();
		
		
		//Switch
		System.out.print("The Player is " + compute);
		switch (compute % 3) {
		case 0: System.out.println(" Scissor"); break;
		case 1: System.out.println(" Rock"); break;
		case 2: System.out.println(" Paper"); break;
	}
		
		
		
		System.out.print("You is " + player);
		switch (player % 3) {
			case 0: System.out.println(" Scissor"); break;
			case 1: System.out.println(" Rock"); break;
			case 2: System.out.println(" Paper"); break;
		}
		
		
		//output
		
		if (compute == player)
			System.out.println("fUNNY GUY WE HAVE A TIE! ");
		else {
			boolean x = (player == 0 && compute == 2) || (player == 1 && compute == 0) || (player == 2 && compute == 1);
			
			if (x) {
				System.out.print("WINNER WINNER CHICKEN DINNER!");
				
			}
			else {
				System.out.print("NO TRY AGAIN!");
			}
		}
		
	}

}