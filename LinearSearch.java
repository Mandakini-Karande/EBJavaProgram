import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a[]= new int[9];
		 
		 int key, pos=0;
		 
		 //accept array elements
		 
		 Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter array elements");
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter key element to search in an array");
		
		key=sc.nextInt();
		
		//search: Linear Search
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i] == key)    // 3==9,
			{
				pos=i+1;   
				break;
			}
			
		}
		
		if(pos>0)
		{
			
			System.out.println("successful search");
			System.out.println(key+ "fount at position" +pos);
			
		}
		else
		{
			System.out.println("successful Search");
		}
		
	
		
	}

}
