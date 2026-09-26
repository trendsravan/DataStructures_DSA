package Video15_BinarySrchInterviewQns;

public class ZPractice {
	
	
	static int cealingNumber(int[] a, int CN) {
		
		int start =0;
		int end =a.length-1;
		boolean isAsc = a[start]<a[end];
		while(start <= end) {
			int mid  = start + (end-start)/2;
			if(CN == a[mid]) {
				if(mid+1 <a.length-1) {
					return a[mid+1];
				}else
					return a[0];
			}
			else if(isAsc) {
				if(CN<a[mid]) {
					end =mid-1;
				}else 
					start =mid+1;
			}
			else {
				if(CN<a[mid]) {
					start =mid+1;
				}else
					end =mid-1;
			}
		}
		
		return a[start];
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4,6,7,8,9 };
		int c = cealingNumber(a, 5);
		System.out.println(c);
	}

}
