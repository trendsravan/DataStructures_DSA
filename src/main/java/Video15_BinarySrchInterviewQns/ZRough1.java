package Video15_BinarySrchInterviewQns;

public class ZRough1 {
	
	static int targetSearch(int[] a, int target) {
		int s =0;
		int e = a.length-1;
		int p =pivot(a);
		int firstSrch = binarySearch(a, target, s, p);
		if(firstSrch !=-1) {
			return firstSrch;
		}else
			return binarySearch(a, target, p, e);
	}

	static int pivot(int[] a) {
		int s = 0;
		int e = a.length - 1;
		while (s <= e) {
			int m = s + (e - s) / 2;
			if (a[m] > a[m + 1]) {
				return m;
			} else if (a[m] < a[m - 1]) {
				return m - 1;
			} else if (a[s] < a[m]) {
				s = m + 1;
			} else if (a[s] > a[m]) {
				e = m - 1;
			}
		}return -1;
	}

	static int binarySearch(int[] a, int target, int s, int e) {
		while (s <= e) {
			int m = s + (e - s) / 2;
			if (target == a[m]) {
				return m;
			} else if (target < a[m]) {
				e = m - 1;
			} else
				s = m + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println(targetSearch(a, 4));
	}
}
