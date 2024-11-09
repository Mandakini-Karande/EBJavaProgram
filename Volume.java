package edu;

public class Volume {
    
	public double cube;
	public double sphere;
	public double cuboid;
	
	
	
	//volume of cube
	public void Cal_volume( int s)
	  {
		  cube= s * s * s;
		  System.out.println("volume of cube="+cube);
	  }

	// volume of sphere
	 public void Cal_volume( double r)
	  {
		   sphere=4/3 * 3.14 * r * r * r;
		  System.out.println("volume of sphere="+sphere);
		
	  }
	
	 //volume of cuboid
	 
	     public void Cal_volume( double l, double b, double h)
	     {
	    	  cuboid= l * b * h;
	    	  System.out.println("volume of cuboid="+cuboid);
			
	    	 
	     }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Volume v1= new Volume();
		v1.Cal_volume(6);
		v1.Cal_volume(5.6);
		v1.Cal_volume(7, 5, 7.5);
		
		
		
	}

}