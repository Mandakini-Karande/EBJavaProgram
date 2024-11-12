package ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=10,b=0;
		System.out.println("Before division");
		try {
		   int c=a/b;
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("after division");
	}


		
		
		
		
		
		
	}


