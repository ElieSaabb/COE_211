import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
       int input ;
	String answer;

	Scanner scan = new Scanner(System.in);
	
	

	do{
	System.out.println("Which service would you like to use? ");
	input = scan.nextInt();
			scan.nextLine();

	if(input<=4 && input>=1) {
	switch(input){

	case 1 :
		BasicWeek bw = new BasicWeek();
			bw.printDays();
			break;
	case 2 : 
		AdvancedWeek aw = new AdvancedWeek();
			aw.printDays();
			break;
	case 3 : 
		Calculator cal = new Calculator();
			
				break;
	case 4 :
		Employee emp = new Employee();
			emp.toString();
			break;
		}
	}else{
		System.out.println("Please make sure you pick a number between 1 and 4");}
       	System.out.println("Would you like to perform another operation ? (y/n)");
        		 answer = scan.nextLine();






	}while(answer.equals("y"));



    }
}