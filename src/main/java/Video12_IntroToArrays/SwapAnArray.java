package Video12_IntroToArrays;
import java.util.Arrays;
public class SwapAnArray {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9};
		//swap(a, 1, 3);
		System.out.println(Arrays.toString(a));
		swapEntireArray(a, 0, a.length-1);
	}
	static int[] swap(int[] a, int start, int end) {
		int temp =a[start];
		a[start] = a[end];
		a[end] = temp;
		return a;
	}
	static void swapEntireArray(int[] a, int start, int end) {
		while(start < end) {
			swap(a, start, end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}

}
