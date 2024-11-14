package CollectonFrame;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//null is not allowed as keyt

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap <String,Integer> hm=new TreeMap<String, Integer>();
		hm.put("fgh",350);
		hm.put("cfg",654);
		hm.put("MERN",null);
		hm.put("MERN",550);
		hm.put("C",576);
		System.out.println(hm);
		
		hm.put("MERN",850);   // if we trying for duplicates  java takes last key
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		for(Map.Entry <String,Integer> entry : hm.entrySet())
		{
			System.out.println(entry);
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}
		
	
	}
}
