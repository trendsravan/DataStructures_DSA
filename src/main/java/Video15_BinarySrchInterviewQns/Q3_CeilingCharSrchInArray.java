package Video15_BinarySrchInterviewQns;

public class Q3_CeilingCharSrchInArray {

	public static void main(String[] args) {
		char[] chr = { 'b', 'd', 'f', 'g', 'i', 'j' };
		System.out.println(celingCharSrch(chr, 'j'));
	}

	static char celingCharSrch(char[] c, char target) {
		int SI = 0;
		int EI = c.length - 1;
		int mid = 0;
		while (SI <= EI) {
			mid = SI + ((EI - SI) / 2);
			if (target == c[mid]) {
				if (mid + 1 < c.length) {
					return c[mid + 1];
				} else
					return c[0];
			} else if (target < c[mid]) {
				EI = mid - 1;
			} else
				SI = mid + 1;
		}
		if (target <= c[0] || target >= c[c.length - 1]) {
			return c[0];
		}
		return c[SI];
	}
}
