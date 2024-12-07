import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
	    n=sc.nextInt();
	    
	    int arr[]=new int[n];
	    System.out.println("enter "+"the array elemrnts");
	    
	    for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	  
	 //   System.out.println("enter the key element that u want to search");
	   // int key=sc.nextInt();
		
		
		
	    //bubble sort
	    
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n-1-i;j++)  //4 2 7 9 3 12
	    	{
	    		if(arr[j] > arr[j+1])
	    		{
	    			int t=arr[j]; // t=4
	    			arr[j]=arr[j+1];  // arr[0]=2 a[1]=2
	    			arr[j+1]=t;
	    			
	    		}
	    	}
	    }
		
	    System.out.println("sorted elements are");
	    
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(arr[i]);
	    }
		
		
	}

}
