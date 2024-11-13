package CollectonFrame;

import java.util.ArrayList;


public class Test1 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //  int arr1[]=new int [10];
   
		ArrayList al= new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(1000);
		al.add(2000);
		
		System.out.println(al);
		System.out.println(al.size());
		
		
		al.add("java");
		al.add("python");
	System.out.println(al);
	System.out.println(al.size());
		
	al.add(0,999);
	System.out.println(al);
	System.out.println(al.size());
	
	
	al.set(0, 555);
	System.out.println(al);
	System.out.println(al.size());
	
	al.remove(0);
	System.out.println(al);
	System.out.println(al.size());
	
	//Generic version of ArrayList
	   ArrayList <String> courses= new ArrayList<String>();
	   courses.add("jfs");
	   courses.add("pfs");
	   courses.add("mern");
	   courses.add("jfs");
	  // courses.add(100);
	   
	   //to access a element we have get() method
	   System.out.println(courses.get(0));
	   System.out.println(courses.get(1));
	   System.out.println(courses.get(2));
	   System.out.println(courses.get(3));
	 //  System.out.println(courses.get(4)); we gwt exception
	   
	   System.out.println("-----------");
	   
	   //Traversal using forEach loop
	    
	   for(String course:courses)
	   {
		   System.out.println(course);
	   }
	   
	   
	   
	/* 1.arrayList is growable in nature
      2. duplicates are allowed
	3.maintained insertion order*/
	   
	  // Iterable <-collection<-sequenceCollection<-List<-ArrayList
	   
	
	
	}

}
