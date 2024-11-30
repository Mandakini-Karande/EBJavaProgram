package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MainBigIntApp {

	
	public static String multipyNumbers(String num1,String num2)
	{
		BigInteger n1=new BigInteger(num1);
		BigInteger n2=new BigInteger(num2);
		
		return n1.multiply(n2).toString();
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	  String num1;
	  String num2;
	  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num1=br.readLine();
		num2=br.readLine();
		
		System.out.println(MainBigIntApp.multipyNumbers(num1,num2));
		
	}

}
