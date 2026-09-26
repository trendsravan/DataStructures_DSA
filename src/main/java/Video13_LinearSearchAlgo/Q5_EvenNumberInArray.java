package Video13_LinearSearchAlgo;

import java.util.Arrays;

public class Q5_EvenNumberInArray {
	public static void main(String[] args) {
		int[] a = {12,345,2,6,2456, -2789};
		System.out.println(Arrays.toString(a));
		System.out.println(evenNumberCount(a));

	}
	
	static int evenNumberCount(int[] a) {
		int count =0;
		for(int e:a) {
			int size=String.valueOf(e).replaceAll("[^0-9]", "").length();
			if(size%2 ==0) {
				count++;
			}
		}
		return count;
	}

}
