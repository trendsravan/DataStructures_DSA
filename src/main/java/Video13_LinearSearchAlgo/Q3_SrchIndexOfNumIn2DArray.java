package Video13_LinearSearchAlgo;

import java.util.Arrays;

public class Q3_SrchIndexOfNumIn2DArray {

	public static void main(String[] args) {
		int[][] a = new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.toString(search(a, 9)));

	}
	
	int[] b = new int[]{1,2};
	static int[] search(int[][] a, int numSearch) {
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(a[i][j]==numSearch) {
						return new int[]{i,j};
					}
				}
			}
			return new int[] {-1,-1};
		}

}
