package CollectonFrame;

import java.util.HashSet;

public class HashSetCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> c1 = new HashSet<String>();
		c1.add("C");
		c1.add("MERN");
		c1.add("FSJ");
		c1.add("Software Testing");
		c1.add("Networking");
		
		 for(String course:c1)
		   {
			   System.out.println(course);
		   }
		
		
		
		
	}

}
