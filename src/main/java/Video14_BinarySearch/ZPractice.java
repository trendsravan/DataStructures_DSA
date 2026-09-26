package Video14_BinarySearch;
public class ZPractice {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9}; //0 1 2 3 4
		System.out.println(orderAgnosticBinary(a, 10));
	}

	static int orderAgnosticBinary(int[] a, int srchNum) {
		int startIndex =0;
		int EndIndex =a.length-1;
		while(startIndex <=EndIndex) {
			int midIndex = (startIndex+((EndIndex-startIndex)/2));
			if(srchNum == a[midIndex]) {
				return midIndex;
			}
			else if(a[startIndex]<a[EndIndex]) {
				if(srchNum<a[midIndex]) {
					EndIndex=midIndex-1; 
				}else
					startIndex=midIndex+1;
			}
			else {
				if(srchNum<a[midIndex]) {
					startIndex=midIndex+1;
				}else
					EndIndex=midIndex-1;
			}
		}
		return -1;
	}
}
