package CollectonFrame;

import java.util.TreeSet;
//TreeSet
/*It maintained the order
- numbers are stored in ascending order
 Strings are stored in alphabetical order
- duplicates are not allowed
-null values are not allowed
-
*/

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet <Integer> h1=new TreeSet<Integer>();
		
		h1.add(300);
		h1.add(674);
		h1.add(180);
		h1.add(998);
		h1.add(650);
		
		System.out.println(h1);
		h1.add(100);
		System.out.println(h1);
		//h1.add(null);
		//System.out.println(h1);
	}

}
