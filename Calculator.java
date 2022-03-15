import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
        
        Scanner scan = new Scanner(System.in);
       
	 System.out.println("Enter the first number: ");
	   num1 = scan.nextInt();
	  	scan.nextLine();
	System.out.println("Enter the operator: ");
	   operator = scan.nextLine();

	System.out.println("Enter the second number: ");
	   num2 = scan.nextInt();
	   

         
        switch(operator){
	case "+" : System.out.println(add(num1, num2));
		break;
	case "-" :System.out.println(substract(num1, num2));
		break;
	case "x" :System.out.println(multiply(num1, num2));
		break;
	case "/" :System.out.println(divide(num1, num2));
		break;
    }}

    public String add(int a, int b) {
        String x = a + "+" + b + " = "  + (a+b);
        return x;
    }

    public String substract(int a, int b) {
        String x =a + "-" + b + " = " +(a-b);
		return x ;
    }

    public String multiply(int a, int b) {
        String x =a +" x " + b + "=" + (a*b);
		return x ;
    }

    public String divide(int a, int b) {
        String x = a + " / " + b  + "= "+ (a/b);
    return x ;
}}