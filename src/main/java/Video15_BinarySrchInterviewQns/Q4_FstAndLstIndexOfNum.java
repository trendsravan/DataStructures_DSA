package Video15_BinarySrchInterviewQns;

import java.util.Arrays;

public class Q4_FstAndLstIndexOfNum {
	/*
	 * Find First And Last Position Of An Element In Sorted Array EG: - Nums =
	 * {5,7,7,8,8,10}; Target =8; OutPut ={3,4}; If Target not Fount = return
	 * {-1,-1}; Write Algorithm with O(log n) Approach
	 */
	static int[] FirsttandLstIndexOfANum(int[] a, int target) {
		int[] ans = { -1, -1 };
		ans[0] = FindIndexOfNum(a, target, true);
		ans[1] = FindIndexOfNum(a, target, false);
		return ans;
	}

	static int FindIndexOfNum(int[] a, int target, boolean TureMoveLeft) {
		int SI = 0;
		int EI = a.length - 1;
		int MI = 0;
		int ans = -1;

		while (SI <= EI) {
			MI = SI + (EI - SI) / 2;
			System.out.println("SI: " + SI + ", MI: " + MI + ", EI: " + EI);

			if (target < a[MI]) {
				EI = MI - 1;
			} 
			else if (target > a[MI]) {
				SI = MI + 1;
			} 
			else {
				ans = MI;
				if (TureMoveLeft) {
					EI = MI - 1;
				} else
					SI = MI + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 5, 7, 7, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString(FirsttandLstIndexOfANum(a, 10)));
	}
}