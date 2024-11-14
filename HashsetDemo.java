package CollectonFrame;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(300);
		h1.add(674);
		h1.add(180);
		h1.add(9998);
		h1.add(650);
		
		System.out.println(h1);
		h1.add(100);
		System.out.println(h1);
		h1.add(null);
		System.out.println(h1);
		
		
		
	}

}
