package Video12_IntroToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2D {

	public static void main(String[] args) {
//		new Object[][]{ ... }  ✅ no size mentioned
//		new int[2][] { ... }   ❌ size + initializer → illegal ❌
		
// ✅Option 1: No size, only initializer (MOST COMMON)
		int[][] i = {
			    {1,2},
			    {3,4}
			};
// ✅Option 2: Use new but no size
		int[][] j = new int[][]{
		    {1,2},
		    {3,4}
		};
// ✅Option 3: Use size, then assign later	
		int[][] k = new int[2][];
		k[0] = new int[]{1,2};
		k[1] = new int[]{3,4};
//---------------------------------------------------------------------------		
		int[][] a = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
		
		int[][] b = new int[3][3];
		Scanner in = new Scanner(System.in);
		for(int row=0; row<b.length; row++) {
			for(int col=0; col<b[row].length; col++) {
				b[row][col] = in.nextInt();
			}
		}
		//Print
		for(int row=0; row<b.length; row++) {
			for(int col=0; col<b[row].length; col++) {
				System.out.println(b[row][col]);
			}
		}
		
		for(int[] row: b) {
			System.out.println(Arrays.toString(row));
			
		}
	}
}
