package ZPractice;

public class Test2 {
	
	static int binarySearch(int[] a, int value) {
		int start =0;
		int end 	 = a.length-1;
		while(start <= end) {
			int mid  = start + (end-start)/2;
			if(value == a[mid]) {
				return mid;
			}
			else if(value < a[mid]) {
				end = mid -1;
			}
			else if(value > a[mid]) {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {-18,-7,-1,1,3,5,7,9};
		int v = binarySearch(a, -1);
		System.out.println(v);
}}
