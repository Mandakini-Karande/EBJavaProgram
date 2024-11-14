package CollectonFrame;

import java.util.HashMap;

//Map
/*
 * to store key-value pairs
 * It is not a part of CollecctionFramework
 * Maintained order based on hash code of keys.
 * Duplicate key is not allowed..
 * Duplicate values are allowed..
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,Integer> hm=new HashMap<String, Integer>();
		hm.put("JFS",350);
		hm.put("PFS",654);
		hm.put("MERN",550);
		hm.put("MERN",550);
		hm.put("C",450);
		System.out.println(hm);
		
		hm.put("MERN",850);   // if we trying for duplicates  java takes last key
		System.out.println(hm);
		
	
	}

}
