import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan Calc = new Scanner(System.in);
       
	 System.out.println("Enter the first number: ");
	   num1 = scan.nextInt();
	  	scan.nextLine()
	System.out.println("Enter the operator: ");
	   operator = scan.nextLine();

	System.out.println("Enter the second number: ");
	   num2 = scan.nextInt() 
	   

        // Decide on the operation to perform 
        switch(operator){
	case "+" : add(num1, num2);
		break;
	case "-" :substract(num1, num2);
		break;
	case "x" :multiply(num1, num2);
		break;
	case "/" :divide(num1, num2);
		break;
    }

    public String add(int a, int b) {
        return  a + "+" + b " = "  + (a+b);
    }

    public String subtract(int a, int b) {
        return a + "-" + b + = + (a-b);
    }

    public String multiply(int a, int b) {
        return a +" x " + b = + (a*b);
    }

    public String divide(int a, int b) {
        return a + " / " + b  + =  + (a/b);
    }
}