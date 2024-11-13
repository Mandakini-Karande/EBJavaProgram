package CollectonFrame;

import java.util.ArrayList;
import java.util.LinkedList;
/*
 *
 * best usage frequent operations is add or delete element  in the middle
 * 
 *  */
 
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Double> salaries = new LinkedList<Double>();
		salaries.add(56000.00);
		salaries.add(46000.00);
		salaries.add(36000.00);
		salaries.add(76000.00);
		salaries.add(80000.00);
		
		System.out.println(salaries);
		
		salaries.add(2,45656.00);
		System.out.println(salaries);
		
		salaries.remove(3);
		System.out.println(salaries);
		
		
		
	}
	
	

}
