package Video13_LinearSearchAlgo;

import java.util.Arrays;

public class Q2_CharSrchInString {
	public static void main(String[] args) {
		String s = "Sunday monday";
		//System.out.println(s.charAt(0));
		//System.out.println(charSearch1(s, 'S'));
//		System.out.println(charSearch2(s, 'y'));
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(s);
		System.out.println(s.toCharArray());
	}
	static boolean charSearch1(String s, char c) {
		for(int i=0; i<s.length(); i++) {
			if(c== s.charAt(i)) {
				return true;
			}
			//return c ==s.charAt(i); [Exits the loop after first iteration]
		}
		return false;
	}
	static boolean charSearch2(String s, char c) {
		for(char each : s.toCharArray()) {
			if(each == c) {
				return true;
			}
			//return each ==c; [Exits the loop after first iteration]
		}
		return false;
	}
}
