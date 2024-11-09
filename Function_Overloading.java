package edu;

public class Function_Overloading {

	public void compute(int num, char operation) {
        if (operation == 's') {
            System.out.println("Square: " + (num * num));
        } else {
            System.out.println("Cube: " + (num * num * num));
        }
    }

    // Method to compute volume/diagonal of cube
    public void compute(double side, char operation) {
        if (operation == 'v') {
            System.out.println("Volume of cube: " + (side * side * side));
        } else {
            System.out.println("Diagonal of cube: " + (side * Math.sqrt(3)));
        }
    }

    // Method to compute area/perimeter of rectangle
    public void compute(int length, int breadth, char operation) {
        if (operation == 'a') {
            System.out.println("Area of rectangle: " + (length * breadth));
        } else {
            System.out.println("Perimeter of rectangle: " + (2 * (length + breadth)));
        }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Function_Overloading fl=new Function_Overloading();
		
		
	        // Test compute(int, char)
		fl .compute(5, 's'); // Square
		fl.compute(5, 'c'); // Cube

	        // Test compute(double, char)
		fl.compute(4.0, 'v'); // Volume of cube
		fl.compute(4.0, 'd'); // Diagonal of cube

	        // Test compute(int, int, char)
		fl.compute(6, 4, 'a'); // Area of rectangle
		fl.compute(6, 4, 'p'); // Perimeter of rectangle
	    }
		
		
		
	}


