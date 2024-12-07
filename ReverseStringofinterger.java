import java.util.Scanner;

public class ReverseStringofinterger {

	
public static void main(String args[])
{
	/*String num;
	
	Scanner sc=new Scanner(System.in);
	 num=sc.nextLine();
	StringBuffer sb= new StringBuffer(num);
	sb.reverse();
	System.out.println(sb.toString());
	*/
	
	int num;
	Scanner sc=new Scanner(System.in);
	 num=sc.nextInt();
	
	   String num1= String.valueOf(num);
	   
	   StringBuilder sb = new StringBuilder(num1);
	   sb.reverse();
	   System.out.println(Integer.valueOf(sb.toString()));
	
		
		
	}

}
