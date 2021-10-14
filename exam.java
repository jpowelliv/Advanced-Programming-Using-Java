package practiceExamSpring20;
/**
 * Joseph Powell IV
 2.2.20
 * practice Exam 1
 * CIS 315
 * 
 * @author josh_
 *
 */

import java.util.Scanner;
public class PracticeExam {
	static int sumRow(int rowNum, int data[][]) {
		int sum = 0;
		for(int i = 0; i < data[rowNum].length; ++i) {
			sum += data[rowNum][i];
		}
		return sum;
	}
	static int sumCol(int colNum, int data[][]) {
		int sum = 0;
		for(int i = 0; i < data[colNum].length; ++i) {
			sum += data[colNum][i];
		}
		return sum;
	}
	
	static double overallAverage(int data[][]) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			for(int i1 = 0; i1 < data[i1].length; i1++) {
				sum += data[i1][i1];
				count++;
			}
		}
		double avg = (double)sum/count;
		return avg;
	}
	
	 static void displayResults(int rowSum, int colSum, double average) {

         System.out.println("Sum of elements in specified row: " + rowSum);

         System.out.println("Sum of elements in specified column: " + colSum);

         System.out.println("Overall average of elements: " + average);
	 }

	public static void main(String[] args) {

		int[][] data = { 
                { 0, 1, 2, 3, 4, 5, 6 }, 
                { 0, 1, 2, 3, 4, 5, 6 }, 
                { 0, 1, 2, 3, 4, 5, 6 },
                { 0, 1, 2, 3, 4, 5, 6 }, 
                { 0, 1, 2, 3, 4, 5, 6 }, 
                { 0, 1, 2, 3, 4, 5, 6 }, 
                { 0, 1, 2, 3, 4, 5, 6 },
                { 0, 1, 2, 3, 4, 5, 6 } };
		
		// input: TODO prompt the user for 
		// 1) a row number
		// 2) a column number
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of rows: " );
		int rowNum = sc.nextInt();
		
		System.out.print("Enter number of coulmns: " );
		int colNum = sc.nextInt();
		
		
		// processing: TODO implment the methods below
		int rowSum = sumRow(rowNum, data);
		int colSum = sumCol(colNum, data);
		
		double all = overallAverage(data);
		displayResults(rowSum, colSum, all);

		// output: TODO display the three answers
		// using a method named displayResults

	}

}
