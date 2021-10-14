

import java.util.Scanner;

/* Joseph Powell IV
*CIS315
*Create a GPA calculator. 
*Ask the end user for the credit hours and letter grade for each class. 
*Once the user is finished with the data entry, calculate and output the overall GPA for the given input.
*For example, if four classes are input, each of which is a three-hour course, with grades of A, B, B, and B, the overall GPA will be 3.25.
*(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
*The exact user interaction is up to you. 
*As long as the requirements above are met, the code is readable (and properly documented), and the application is user-friendly, you will earn full credit.
*2020/01/25
*/

public class GPA {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double credits = 0;
			double totalCreds = 0;
			while (true) {
				System.out.print("Please enter Credit hours & Grade (Letters E & X is to exit): ");
				int creditHours = input.nextInt();
				char grade = input.next().charAt(0);
				if (creditHours == 2 && grade == 'X')
					break;
			
			
			//Switch
			switch(grade)
				{
				case 'A': credits = credits + (creditHours * 4); 
			       break ;
			       case 'B': credits = credits + (creditHours * 3); 
			       break ;
			       case 'C': credits = credits + (creditHours * 2); 
			       break ;
			       case 'D': credits = credits + (creditHours * 1); 
			       break ;
			       case 'W': credits = credits + (creditHours * 0); 
			       break ;
			       default:
			       break;
			      }
			totalCreds = totalCreds + creditHours;
				}
			}
			
			double credits = 0;
			double totalCreds = 0;
			//output
			double overallGPA = credits/(double)(totalCreds);
			System.out.println("Overall GPA: " + overallGPA);
	}

}