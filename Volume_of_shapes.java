package edu;

public class Volume_of_shapes {
          
	public double Cal_volume( int s)
	{ 
		return s* s* s;
	}
	
	public double Cal_volume( double r)
	{ 
		return (double) 4/3*3.14*r*r*r;
	}
	
	public double Cal_volume(int l,int b, int h )
	{ 
		return l * b* h; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Volume_of_shapes v1=new Volume_of_shapes();
		//volume of cube
		int side=10;
		double cubevol=v1.Cal_volume(side);
		System.out.println("volume of cube="+cubevol);
			
		
		//volume of sphere
		double radius=4.5;
		double spherevol=v1.Cal_volume(radius);
		System.out.println("volume of cube="+spherevol);
		
	// volume of cuboid
		int l=10,b=7,h=5;
		double cuboidvol=v1.Cal_volume(l,b,h);
		System.out.println("volume of cube="+cuboidvol);
		
	
	}

}
