package Video15_BinarySrchInterviewQns;

public class ZRough1 {

	static int cealing(int[] a, int target, boolean isCealing) {
		int SI =0;
		int EI =a.length-1;
		while(SI<=EI) {
			int MI =SI+(EI-SI)/2;
			
			if(target == a[MI]) {
				return MI;
			}
			if(isCealing) {
			  if(target<a[MI]) {
					EI=MI-1;
				}else
			  		SI=MI+1;
			}
			else {
				if(target<a[MI]) {
					SI=MI+1;
				}else
					EI=MI-1;
			}
		}
		if(isCealing) {
			return a[SI];
		}else
			return a[EI];
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,7,9};
		System.out.println(cealing(a, 6, true));
	}
}
