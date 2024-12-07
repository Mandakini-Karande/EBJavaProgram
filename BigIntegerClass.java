import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerClass {

	public static String multiply1(String num1,String num2)
	
	{
		 BigInteger b1=new BigInteger(num1);
		 BigInteger b2=new BigInteger(num1);
		 BigInteger result = b1.multiply(b2);
		 
		// return result=b1.multiply(b2).toString();
		 return b1.multiply(b2).toString();
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num1 = br.readLine();
		String num2 = br.readLine();
		System.out.println(BigIntegerClass. multiply1(num1, num2));
		   
	}

}
