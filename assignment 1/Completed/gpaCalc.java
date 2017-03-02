/**
 *Gerardo Enriquez
 *CSC 123
 *Assignment 1 2/9/2016
 *
 */

import java.io.*;
public class gpaCalc {
	public static void main(String[] args) {
		BufferedReader br = null;
		double finalGPA = 0;
		double totalGPA = 0;
		double numOfClasses = 0;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));
			while ((sCurrentLine = br.readLine()) != null) {
				totalGPA += readLine(sCurrentLine);
				numOfClasses++;
			}
			finalGPA = totalGPA/numOfClasses; 		  		 
			System.out.println("The Final GPA is " + String.format("%.2f", finalGPA));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
				System.exit(0);
			}
		}
	
	}
	public static double readLine(String line) 
{
			//char lastCharacterOfLine = //Read the last character of the line since that is the grade
			//double gpa = 0;
		String lastCharacterOfLine = line.substring(line.length()-1);
		
		if(lastCharacterOfLine.equals("A")) {
			return 4.0;
		}
		else if(lastCharacterOfLine.equals("B")) {
			return 3.0;
		}
		else if(lastCharacterOfLine.equals("C")) {
			return 2.0;
		}
		else if(lastCharacterOfLine.equals("D")) {
			return 1.0;
		}
		else
		{
			System.out.println("Invalid Letter Grade in the file. Program is existing");
			System.exit(0);
			return -999.00;
		}
	}
}