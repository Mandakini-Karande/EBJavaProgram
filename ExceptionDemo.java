package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {4,5,3};
		int b=10,c=2,d;
		System.out.println("Before array access");
		try {
		System.out.println(a[4]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try
		{
			d=b/c;
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			System.out.println("Executes always");
		}
		
		System.out.println("after array access");


	
		
	}

}
