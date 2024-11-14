package edu;

public class AbstractClasses {

	public abstract class Animal {
	    public abstract void sound();

	    public void eat() {
	        System.out.println("Animal eats");
	    }
	}

	public class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	public class Cat extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
	}

}
