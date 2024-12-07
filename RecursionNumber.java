
public class RecursionNumber {

	private static int findfact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return (n * findfact(n-1));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int n=6;
		 int f=findfact(n);
	      System.out.println("factorial of " +n+ "is" +f);
	          
	
	
	}

}
