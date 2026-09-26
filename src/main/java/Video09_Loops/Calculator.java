package Video09_Loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("Enter the operator (+, -, *, /, %) or 'x' to exit:");
	            char op = in.next().charAt(0);

	            if (op == 'x' || op == 'X') {
	                System.out.println("Exiting the calculator. Goodbye!");
	                break;
	            }

	            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
	                System.out.println("Enter two numbers:");
	                int n1 = in.nextInt();
	                int n2 = in.nextInt();
	                int result = 0;

	                switch (op) {
	                    case '+': result = n1 + n2; 
	                    case '-': result = n1 - n2;
	                    case '*': result = n1 * n2; 
	                    case '/': 
	                        if (n2 != 0) {
	                            result = n1 / n2;
	                        } else {
	                            System.out.println("Division by zero is not allowed.");
	                            continue;
	                        }
	                        
	                    case '%': 
	                        if (n2 != 0) {
	                            result = n1 % n2;
	                        } else {
	                            System.out.println("Modulo by zero is not allowed.");
	                            continue;
	                        }
	                       
	                }
	                
	                System.out.println("Result: " + result);
	            } else {
	                System.out.println("Please enter a valid operator!");
	            }
	        }

	        in.close();
	}
}
