package Video13_LinearSearchAlgo;

public class Q4_MaxNumIn2DArray {

	public static void main(String[] args) {
		
		int[][] a= {{1,3,5}, {37,24,65},{27,456,28}};
		System.out.println(maxNumber(a));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		

	}
	
	static int maxNumber(int[][] a) {
		int max=a[0][0];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		return max;
	}
}
