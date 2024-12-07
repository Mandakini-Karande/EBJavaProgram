import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int size;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
	    size=sc.nextInt();
	    
	    int arr[]=new int[size];
	    System.out.println("enter the array elemrnts");
	    
	    for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
	  
	    System.out.println("enter the key element that u want to search");
	    int key=sc.nextInt();
	    int pos=0;
	    
	    int l=0;
		int h=size-1;
	//	int mid=(l+h)/2;
		
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==arr[mid])
			{
				 pos=mid;
				 break;
			}
			
			else if(key > arr[mid])
			{
				l=mid+1;
				
			}
			
			else if(key < arr[mid])
	
			{
				h=mid-1;
				
			}
			
		}
		
		if(pos>0)
		{
			System.out.println("Successful search");
			   System.out.println(key+" found at position "+(pos+1));
	    }
		
		else
		{
			   System.out.println(key+" element is not found");
	     }

		
		
		}
	    
		
	
	}


