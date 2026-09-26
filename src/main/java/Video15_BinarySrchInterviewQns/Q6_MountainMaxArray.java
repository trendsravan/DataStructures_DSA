package Video15_BinarySrchInterviewQns;

public class Q6_MountainMaxArray {
	public static void main(String[] args) {
//		int[] a= {1,3,5,6,3,1};
		int[] a= {1,2,3,5,7,6,3,2};
//		int[] a = {4,5,6,3,2,1,0};
//		int[] a = {1,2,3,4,5,6,7};
		System.out.println(mountainMax(a));
	}
	static int mountainMax(int[] a) {
		int SI=0;
		int EI=a.length-1;
		int MI=0;
		while(SI<EI) {
			MI=SI+(EI-SI)/2;
			System.out.println("SI: " + SI + ", MI: " + MI + ", EI: " + EI);
			 if(a[MI]<a[MI+1]) {
				SI=MI+1;
			}
			else if(a[MI]>a[MI+1]) {
				EI=MI;
			}
		}
		System.out.println("SI: " + SI + ", MI: " + MI + ", EI: " + EI);
		return SI;// At Peak both SI & EI point to same value.
	}
}
