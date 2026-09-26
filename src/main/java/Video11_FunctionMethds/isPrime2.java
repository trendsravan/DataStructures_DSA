package Video11_FunctionMethds;
import java.util.Scanner;
public class isPrime2 {
	static boolean isPrimeNum(int n) {
		if(n<=1) {
			return false;
		}
		int c =2;
		while((c*c)<=n) {			
			if(n%c==0) {
				return false;
			}
			c++;
		}
		if(c*c>n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while (true) { // Infinite loop for continuous input
            System.out.print("Enter a number (-1 to exit): ");
            int num = in.nextInt(); // Take input
            if (num == -1) { // Exit condition
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Is " + num + " a prime number==> " + isPrimeNum(num));
        }
        in.close(); // Close the scanner
	}
}
