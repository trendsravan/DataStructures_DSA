package Video12_IntroToArrays;

import java.util.Arrays;

public class Array_1D {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int[] b = new int[5];
		
		System.out.println(a[0]);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i:a) {
			System.out.println(i);
		}
		

	}

}
