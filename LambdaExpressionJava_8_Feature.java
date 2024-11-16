package Java_8_Feature;
/*
 * Lambda Expression
 * anonomous 
 * name less method in java
 * Lambda expression is used with only functional interface only
 * 
 */

@FunctionalInterface
interface MyFunctionalInterface
{
	void greet();
}


@FunctionalInterface
interface MyFunctionalInterface2
{
	int findSquare(int num);
	
}


public class LambdaExpressionJava_8_Feature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunctionalInterface myFun= () -> System.out.println("hello everyone");
		myFun.greet();
		
		MyFunctionalInterface2 myFun2= (int num) -> num * num;
		int s=myFun2.findSquare(6);
		System.out.println(s);
	}

}
