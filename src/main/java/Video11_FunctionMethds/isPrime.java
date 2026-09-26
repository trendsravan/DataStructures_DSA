package Video11_FunctionMethds;

public class isPrime {
	
	static boolean isPrimeNum(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2 ;(i*i)<=n; i++) {
			if((n)%i == 0) {
				return false;
			}
		}	
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrimeNum(111));
		
	}

}
