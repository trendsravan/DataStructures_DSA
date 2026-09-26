package Video15_BinarySrchInterviewQns;

public class ZPractice1 {
	
		static int infiniteArrayPosition(int[] a, int target) {
			int SI = 0;
			int EI = 1;
			while(target > a[EI]) {
				 int newStart  = EI+1;
				 EI = EI+(EI-SI+1)*2;
				 SI =newStart;
//				SI = EI+1;
//				EI = SI+1;
			}
			return binarySearch(a, target, SI, EI);
		}
	
		static int binarySearch(int[] a, int target, int SI, int EI) {
			while(SI <= EI) {
				int MI =SI + (EI-SI)/2;
				
				if(target == a[MI]) {
					return MI;
				}else if(target < a[MI]) {
					EI =MI-1;
				}else
					SI =MI+1;
			}
			return -1;
		}
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,};
		System.out.println(infiniteArrayPosition(a, 18));
		
		
	}

}
