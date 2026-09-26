package Video11_FunctionMethds;

public class AmstrongNumbers {
	//number that equals the sum of its digits, each raised to a power
	public static void main(String[] args) {
		for (int i = 0; i <= 2000; i++) {
			if (isAmstrong(i) == true) {
				System.out.println(i);
			}
		}
	}
	static boolean isAmstrong(int num) {
		int orgNum = num;
		int s = String.valueOf(num).length();
		int AN = 0;
		while (num > 0) {
			AN = AN + (int) Math.pow(num % 10, s);
			num = num / 10;
		}
		return orgNum == AN;

	}

}
