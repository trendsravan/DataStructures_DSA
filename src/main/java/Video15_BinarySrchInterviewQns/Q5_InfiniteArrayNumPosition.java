package Video15_BinarySrchInterviewQns;

public class Q5_InfiniteArrayNumPosition {
//Find The Position Of  An Element In A Sorted Array of Infinite Number.
	static int searchNum(int[] a, int target) {
		//Lets Start with a Box of Size 2.
		
		int SI = 0;
		int EI = 1;
		while (target > a[EI]) {
			int temp = EI+1;
			EI=EI+(EI-SI+1)*2; //EI = PreviousEnd+(Size Of box)*2
			SI=temp;
//			SI = EI + 1;
//			EI = SI + 1;
		}
		return binarySearch(a, target, SI, EI);
	}

	static int binarySearch(int[] a, int target, int SI, int EI) {
		while (SI <= EI) {
			int MI = SI + (EI - SI) / 2;
			if (target == a[MI]) {
				return MI;
			} else if (target < a[MI]) {
				EI = MI - 1;
			}
			if (target > a[MI]) {
				SI = MI + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 3,5,7,9,10,90,100,130,140,160,170 };
		System.out.println(searchNum(a, 100));
	}
}
