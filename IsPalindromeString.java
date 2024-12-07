
public class IsPalindromeString {

	 public static boolean isPalindrome(String s)
	 {
		 
		 int left=0;
		 int right=s.length()-1;
		 
		 while(left<right)
		 {
			
			 if(s.charAt(left) != s.charAt(right)) {
				 
				 return false;
				 
			 }
			 
		 }
		 
		 
		return true;
		 
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		String str="madam";   
		System.out.println(str+"is palindrome="+isPalindrome(str));
		
	}

}
