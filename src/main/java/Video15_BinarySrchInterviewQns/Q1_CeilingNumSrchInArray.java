package Video15_BinarySrchInterviewQns;

public class Q1_CeilingNumSrchInArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 11 };
		System.out.println(celingArray(a, 12));
	}

	// [Exact match → return same number, Ceiling → smallest number ≥ target]
	static int celingArray(int[] a, int target) {
		int SI = 0;
		int EI = a.length - 1;
		int MI = 0;
		while (SI <= EI) {
			MI = SI + ((EI - SI) / 2);
			System.out.println("SI: " + SI + ", MI: " + MI + "["+a[MI]+"]"+ ", EI: " + EI);
			if (target == a[MI]) {
				return MI;				//Exact match → return same number
			} 
			else if (target < a[MI]) {
				EI = MI - 1;
			} else
				SI = MI + 1;
			System.out.println("SI: " + SI + ", MI: " + MI + ", EI: " + EI);
		}
		return SI;					//Ceiling → smallest number ≥ target
	}
}
