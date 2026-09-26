package Video12_IntroToArrays;
public class MaxNumInArray {
	public static void main(String[] args) {
		int[] a = { 1, 6, 9, 23, 2, 3, 5, 7 };
		System.out.println(maxNumber(a));
	}
	static int maxNumber(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
