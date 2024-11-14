package Java_8_Feature;
/* Interface can have only one abstact class and multiple default, static methods that interface is called as Functional Interface */

@FunctionalInterface

interface Printer {
	void printJob();
	
	//default method introduced in Java-8
	default void scan() {
		System.out.println("Scannning.....");
	}
	
	//Static methods introduced in java8
	
	static void threDPrintJob()
	{
		System.out.println("3DPrinting...");
	}
	
	
}

class EpsonPrinter implements Printer
{

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Printing using EpsonPrinter");
	}
	
}

class CanonPrinter implements Printer
{

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Printing using CanonPrinter");
	}
	
}

public class FunctionalInterJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		Printer p= new EpsonPrinter();
		p.printJob();
		p.scan();
		Printer.threDPrintJob();
		
		
	}

}
