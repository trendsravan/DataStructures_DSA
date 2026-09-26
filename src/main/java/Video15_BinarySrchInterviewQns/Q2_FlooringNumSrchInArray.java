package Video15_BinarySrchInterviewQns;

public class Q2_FlooringNumSrchInArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 11 };
		System.out.println(flooringArray(a, 1));
	}

	// [Exact match → return same Number/Index , Floor → largest Number/Index ≤ target]
	static int flooringArray(int[] a, int target) {
		int SI = 0;
		int EI = a.length - 1;
		while (SI <= EI) {
			int MI = SI + ((EI - SI) / 2);
			if (target == a[MI]) {
				return MI;				//Exact match → return same number
			} 
			else if (target < a[MI]) {
				EI = MI - 1;
			} else
				SI = MI + 1;
		}
		return EI;						//Floor → largest number ≤ target
	}

}
