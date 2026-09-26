package Video15_BinarySrchInterviewQns;

public class Q3_1_CealingCharSearchInArray {
	/*
	 * Q) Find Smallest Letter Greater Than Target :- Given a characters array
	 * letters that is sorted in non-decreasing order and a character target, return
	 * the smallest character in the array that is larger than target.
	 */
			
	static char cealingOfCharacter(char[] a, char target) {
		int start = 0;
		int end = a.length - 1;
		boolean isAsc = a[0] < a[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println("SI: " + start + ", MI: " + mid + ", EI: " + end);
			if (isAsc) {
				if (target < a[mid]) {
					end = mid - 1;
				} else
					start = mid + 1;
			} else {
				if (target < a[mid]) {
					start = mid + 1;
				} else
					end = mid -1;
			}
			System.out.println("SI: " + start + ", MI: " + mid + ", EI: " + end);
		}
		if(isAsc) {
			return a[start % a.length];
		}else
			return a[end];
	}
	public static void main(String[] args) {
		char[] Assending = {'a','c', 'e','g'};
		char[] Decending = {'z','x', 'v','t'};
		System.out.println(cealingOfCharacter(Assending, 'a'));
		System.out.println(cealingOfCharacter(Decending, 'v'));
	}

}
