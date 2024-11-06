package edu;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String Std_Name;
          int Std_Roll_No;
          Float Marks;
          String Dept;
          //1.Date, Year 
          String Mo_No;     //2.mobile number
          
		  Scanner sc=new Scanner(System.in);
		 
		  System.out.println("Enter the Student Name");
		  Std_Name=sc.nextLine();
		  
		  System.out.println("Enter the Student Std_Roll_No");
		  Std_Roll_No=sc.nextInt();
		  
		  System.out.println("Enter the Student Marks");
		  Marks=sc.nextFloat();
		  
		  sc.nextLine();
		  System.out.println("Enter the Student Department Name");
		  Dept=sc.nextLine();
		  
		  System.out.println("Enter the Student Mobile number");
		  Mo_No=sc.nextLine();
		  
	     System.out.println("student Name="+Std_Name);
		 System.out.println("student Roll Number ="+Std_Roll_No);	  
		 System.out.println("student Marks="+Marks);
		 System.out.println("student Dept_Name ="+Dept);
		 System.out.println("student Mobile number ="+ Mo_No);
	
	
	}

}
