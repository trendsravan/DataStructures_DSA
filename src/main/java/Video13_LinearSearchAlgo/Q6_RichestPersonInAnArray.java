package Video13_LinearSearchAlgo;

public class Q6_RichestPersonInAnArray {

	public static void main(String[] args) {
		
		int[][] a = {{1,5}, {7,3},{3,5}};
		
		int wealth2=0;
		for(int i=0; i<a.length; i++) {
			int wealth1=0;
			for(int j=0; j<a[i].length; j++) {
				wealth1 +=a[i][j];
			}
			if(wealth1>wealth2) {
				wealth2=wealth1;
			}
		}
		System.out.println(wealth2);

	} 

}
