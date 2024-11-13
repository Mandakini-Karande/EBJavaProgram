package CollectonFrame;

import java.util.Vector;

/*
 * vect object is 
 * 1. thread safe
 * only one thread is allowed to access vector object.
 * performance is low
 */
//it is legacy class/ old class


public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector <Integer> v= new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(1200);
		v.add(300);
		v.add(600);
		
		
		System.out.println(v);
		
		
	}

}
