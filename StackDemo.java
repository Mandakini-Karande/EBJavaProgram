package CollectonFrame;

import java.util.Stack;

/*
 * Stack
 * -----
 * 1.LIFO (Last in first Order)
 */

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String> s=new Stack <String>();
		s.add("java");
		s.add("python");
		s.add("C");
		s.add("C++");
		s.add("java");
		s.add("ReactJS");
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		
		
		
	}

}
