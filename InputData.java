package edu;
import java.util.Scanner;

//write a java program to read your name, age, salary,gender and display
//them user Scanner class
public class InputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age;
      float salary;
      String name;
      char gen;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter age");
      age=sc.nextInt();
      
       System.out.println("enter your Name");
    //   name=sc.next();// reads word
       sc.nextLine();
       name=sc.nextLine();// complete word
       
     //  System.out.println("enter age");
      // age=sc.nextInt();
       
       System.out.println("enter salary");
       salary=sc.nextFloat();
       
       System.out.println("enter gender");
       gen=sc.next().charAt(0);
       
     //display
       System.out.println("Name="+name);
       System.out.println("Age="+age);
       System.out.println("Salary="+salary);
       System.out.println("Gender="+gen);
       //System.out.println("Age="+age);
	}

}
