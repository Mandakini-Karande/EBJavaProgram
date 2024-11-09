package edu;

public class StringClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String str1 = "Hello";
	        String str2 = "Java";

	        System.out.println("Length: " + str1.length());
	        
	        System.out.println("Concatenation: " + str1 + str2);
	        
	        System.out.println("Equals: " + str1.equals(str2));
	        
	        System.out.println("Substring: " + str1.substring(1, 5));
	        
	        System.out.println("Index Of: " + str1.indexOf('2'));
	        
	        System.out.println("Upper Case: " + str1.toUpperCase());
	        
	        System.out.println("Trim: " + "   Edubridge   ".trim());
	        
	        System.out.println("Split: " + "Hello-Java".split("-")[1]);
		
		
		
		
	}

}
