import java.io.*;  
import java.util.Scanner;

public class ExpensesTracker{
	public static void main (String[] args) throws IOException{
	
	Scanner scan = new Scanner(System.in);
	String name, purchased, answer;
	double payment;

	FileWriter fw = new FileWriter(new File("expenses.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);




do{

	System.out.println("Input your name: ");
		name = scan.nextLine();

	System.out.println("What did you purchase? ");
		purchased = scan.nextLine();

	System.out.println("How much did you pay? (in USD) ");
		payment = scan.nextDouble();
			scan.nextLine();

	outToFile.print(name + " purchased " + purchased + " for " + payment + " US Dollars");
	
		
        outToFile.close();

		System.out.println("Would you like to log another purchase? (y/n)");
		answer = scan.nextLine(); 
		
		

	if(answer.equals("n")){
		System.out.println("Get off of ZoodMall!");
		System.out.println("Would you like to read a summary of your purchases?");
			String answer2 = scan.nextLine();
			

	if(answer2.equals("y")){
		 Scanner fileScan = new Scanner(new File("expenses.txt"));
                    String read;
                    while (fileScan.hasNext()) {
                          read = fileScan.nextLine();
                                System.out.println(read);	
					}	

		}
		}

	}while(answer.equals("y"));


		scan.close();		
	}

}