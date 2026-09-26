package Video14_BinarySearch;
public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		//int[] a = { 1, 3, 5, 7, 9, 10 }; // Ascending
		 int[] a = {19,17,15,13,11};//DescendIndexing
		System.out.println(orderAgnosticBinarySrch(a, 6));
	}
	static int orderAgnosticBinarySrch(int[] a, int SrchNum) {
		int startIndex = 0; 
		int endIndex = a.length - 1;
		while (startIndex <= endIndex) {
			int midIndex = startIndex + ((endIndex - startIndex) / 2);
			if (SrchNum == a[midIndex]) {
				return midIndex;
			}
			else if (a[startIndex] < a[endIndex]) {
				if (SrchNum > a[midIndex]) { 
					startIndex = midIndex + 1;
				} else if (SrchNum < a[midIndex]) {
					endIndex = midIndex - 1;
				}
			} else {
				if (SrchNum > a[midIndex]) {
					endIndex = midIndex - 1;
				} else if (SrchNum < a[midIndex]) {
					startIndex = midIndex + 1;
				}
			}
		}
		return -1;
	}
}
