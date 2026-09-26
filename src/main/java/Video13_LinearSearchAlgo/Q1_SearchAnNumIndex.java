package Video13_LinearSearchAlgo;

public class Q1_SearchAnNumIndex {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		System.out.println(returnNumberIndex(a, 9));
	}
	static int returnNumberIndex(int[] a, int num) {
//		for(int i=0; i<a.length; i++) {
//			int index =0;
//			if(a[i]==num) {
//				return index=i;
//			} 
//		}
		for(int element:a) {
			if(element==num) {
				return element;
			}
		}
		return -1;
	}

}
