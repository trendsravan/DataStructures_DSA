package Video12_IntroToArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray_1_2D {
	public static void main(String[] args) {

//		List<String> list = new ArrayList<>();		
//		System.out.println(list);
		
		List<List<Integer>> list = new ArrayList<>();
		
		System.out.println(list);
		for(int i=0; i<3; i++) {
			list.add(new ArrayList<Integer>());
		}
		System.out.println(list);
		System.out.println(list.size());
		
		Scanner in = new Scanner(System.in);
		for(int row=0; row<list.size(); row++) {
			for(int col=0; col<3; col++) {
				list.get(row).add(in.nextInt());
			}
		}
		System.out.println(list);


	}

}
