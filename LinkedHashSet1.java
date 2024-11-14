package CollectonFrame;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * maintained the insertion order 
 * 
 * 
 * duplicates are not allowed
 * null values are allowed
 */


public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
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


