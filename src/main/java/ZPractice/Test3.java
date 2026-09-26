package ZPractice;

public class Test3 {
		
	static int orderAgnosticSearch(int[] a, int target) {
		int start =0;
		int end =a.length-1;
		boolean isAsc = a[start]<a[end];
		while(start <= end) {
			int mid = start +(end-start)/2;
			
			if(target ==a[mid]) {
				return mid;
			}
			
			else if(isAsc) {
				if(target < a[mid]) {
					end =mid-1;
				}else
					start =mid+1;
			}
			else {
				if(target < a[mid]) {
					start = mid +1;
				}else
					end = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] a = {12,11,10,9,8,7,6,5,4,3,2,1};
		
		int[] b = {1,2,3,4,5,6};
		
		int s =orderAgnosticSearch(a, 11);
		int s1 =orderAgnosticSearch(b, 5);
		System.out.println(s);
		System.out.println(s1);
		
	}
}
