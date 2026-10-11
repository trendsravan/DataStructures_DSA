package Video15_BinarySrchInterviewQns;

public class Q7_FindTargetInMountainArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 3, 1 };
		System.out.println(FindtargetIndexInMountainArray(a, 0));

	}

	static int FindtargetIndexInMountainArray(int[] a, int target) {
		int peakIndex = peakElementInMountain(a);
		int FirstTargetValue= orderAgnosticBinarySrch(a, target, 0, peakIndex);
		if(FirstTargetValue != -1) {
			return FirstTargetValue;
		}else
			return orderAgnosticBinarySrch(a, target, peakIndex, a.length-1);
	}

	static int peakElementInMountain(int[] a) {
		int SI = 0;
		int EI = a.length - 1;
		while (SI < EI) {
			int MI = SI + (EI - SI) / 2;
			if (a[MI] < a[MI + 1]) {
				SI = MI + 1;
			} else
				EI = MI;
		}
		return SI;
	}

	static int orderAgnosticBinarySrch(int[] a, int target, int SI, int EI) {
		while (SI <= EI) {
			int MI = SI + (EI - SI) / 2;
			if (target == a[MI]) {
				return MI;
			} else if (a[SI] < a[EI]) {
				if (target < a[MI]) {
					EI = MI - 1;
				} else
					SI = MI + 1;
			} else {
				if (target < a[MI]) {
					SI = MI + 1;
				} else
					EI = MI - 1;
			}
		}
		return -1;
	}

}
