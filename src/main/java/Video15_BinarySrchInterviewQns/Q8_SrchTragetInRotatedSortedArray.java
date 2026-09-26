package Video15_BinarySrchInterviewQns;

public class Q8_SrchTragetInRotatedSortedArray {
	public static void main(String[] args) {
		int[] a= {3,4,5,6,7,0,1,2,3};
//		int[] a= {4,5,6,3,4,5};
//		int[] a= {3,4,5,6,2};
		System.out.println(FindPivot(a));
		System.out.println(findTargetInRBS(a, 3));
	}
	
	static int findTargetInRBS(int[] a, int target) {
		int SI=0;
		int EI=a.length-1;
		int pivot = FindPivot(a);
		int trgtsrch =binarySrch(a, target, SI, pivot);
		if(trgtsrch !=-1) {
			return trgtsrch;
		}else
			return binarySrch(a, target, pivot-1, EI);
		}
	static int FindPivot(int[] a) {
		int SI = 0;
		int EI = a.length - 1;
		while (SI <= EI) {
			int MI = SI + (EI - SI) / 2;
			if (a[MI] > a[MI + 1]) {
				return MI;
			} else if (a[MI] < a[MI - 1]) {
				return MI + 1;
			} else if (a[SI] > a[MI]) {
				EI = MI - 1;
			} else if (a[SI] < a[MI]) {
				SI = MI + 1;
			}

		}
		return -1;
	}
	
	static int binarySrch(int[] a, int target, int SI, int EI) {
		while(SI<=EI) {
			int MI=(SI+EI)/2;
			if(target==a[MI]) {
				return MI;
			}
			if(target<a[MI]) {
				EI=MI-1;
			}else
				SI=MI+1;
		}
		return -1;
	}

}
