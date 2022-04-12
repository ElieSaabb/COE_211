import java.util.Scanner;

public class Skeleton{
	public static void main(String[] args){

	int[] grades = new int[5];
	int inputGrade;
	int attendance, midGrade;
	int sum = 0;
	double avgAss, avgAtt, avgMid;
	
	Scanner scan = new Scanner(System.in);


	for(int index = 0 ; index < grades.length ; index++){

	System.out.println("Input the grade of assigment " + (index + 1) + " :" );
		inputGrade = scan.nextInt();


	grades[index] = inputGrade;


	}
	System.out.println("Input the number of attended labs: ");
		attendance = scan.nextInt();


	System.out.println("Input the midterm grade: ");
		midGrade = scan.nextInt();

	for(int index = 0 ; index < grades.length ; index++){
			
		sum += grades[index]; 
	
		}
		
		avgAss = (sum / (grades.length - 1)) * 0.3;
			
		avgAtt = (attendance * 100 * 0.05 ) / 7; 

		avgMid = midGrade * 0.03;

	System.out.println("Assignments(30%): " + avgAss + "\n" + "Attendance(5%): " + avgAtt + "\n" + "Midterm(30%): " + avgMid);
	
	
	}
}