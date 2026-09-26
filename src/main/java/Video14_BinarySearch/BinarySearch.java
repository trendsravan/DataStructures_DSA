package Video14_BinarySearch;
public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1,2,3}; // 0 1 2 3 4
		System.out.println(binarySearch(a, 1));
	}
	static int binarySearch(int[] a, int target) {
		int SI = 0;
		int EI = a.length - 1;
		while (SI < EI) {
			int MI = SI + ((EI - SI) / 2);
			if (target == a[MI]) {
				return MI;
			} else if (target < a[MI]) {
				EI = MI - 1;
			} else if (target > a[MI]) {
				SI = MI + 1;
			}
		}
		return -1;
	}

}
