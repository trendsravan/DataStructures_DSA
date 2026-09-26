package Video11_FunctionMethds;

import java.nio.channels.Channel;

public class PassByValue {
	
	static void change(int x) {
		 x =5;
		 System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		int orginal = 10;
		change(orginal);
		System.out.println(orginal);
		
		
	}

}
