
public class StringReverse {

	//1. Reverse String
	public static String reverseString(String s)
	{
		
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="mandakini";
		System.out.println("Original String=" +s1);
		System.out.println("Reversed String=" + reverseString(s1));
	   
		
		
		
	}

}


