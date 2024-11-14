package CollectonFrame;

import java.util.HashSet;

public class HashCdeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				        HashSet<Integer> hs = new HashSet<Integer>();
				        hs.add(100);
				        hs.add(800);
				        hs.add(600);
				        hs.add(300);
				        hs.add(400);
				        System.out.println(hs);
				        System.out.println(hs.hashCode());
				        
				        System.out.println("------------");
				        hs.add(null);
				        System.out.println(hs);
				        String s1 = new String("Java");
				        String s2 = new String("Python");
				        System.out.println(s1.hashCode());
				        System.out.println(s2.hashCode());
				}


			
		
		
	}


