

interface MyInterface{
	int i=10;  //public static final int i=10;
	void m1(); //public abstract void m1();
	void m2();
}


abstract class MyClass2 implements MyInterface{


	@Override
	public void m1() {
		System.out.println("m1");
		
	}


//	@Override
//	public void m2() {
//		System.out.println("m2");
//		
//	}


}


class MyClass3 extends MyClass2{


	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		MyClass3 myClass3 = new MyClass3();
		myClass3.m1();
		myClass3.m2();
	
	}
}


